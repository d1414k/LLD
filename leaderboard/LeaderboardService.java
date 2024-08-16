package leaderboard;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LeaderboardService {

    // Data structures to store games and their leaderboards
    private final Map<String, Map<String, Leaderboard>> gameLeaderboards = new ConcurrentHashMap<>();

    // Method to get supported games
    public Set<String> getSupportedGames() {
        return gameLeaderboards.keySet();
    }

    // Method to create a new leaderboard
    public synchronized String createLeaderboard(String gameID, long startEpochSeconds, long endEpochSeconds) {
        gameLeaderboards.putIfAbsent(gameID, new ConcurrentHashMap<>());
        Leaderboard leaderboard = new Leaderboard(startEpochSeconds, endEpochSeconds);
        String leaderboardID = UUID.randomUUID().toString();
        gameLeaderboards.get(gameID).put(leaderboardID, leaderboard);
        return leaderboardID;
    }

    // Method to get the leaderboard
    public List<ScoreEntry> getLeaderboard(String leaderboardID) {
        List<ScoreEntry> leaderboardEntries = new ArrayList<>();

        for (Map<String, Leaderboard> leaderboards : gameLeaderboards.values()) {
            if (leaderboards.containsKey(leaderboardID)) {
                leaderboardEntries.addAll(leaderboards.get(leaderboardID).getEntries());
                break;
            }
        }

        return leaderboardEntries;
    }

    // Method to submit a score
    public synchronized void submitScore(String gameID, int userID, int score) {
        if (!gameLeaderboards.containsKey(gameID))
            return;

        for (Leaderboard leaderboard : gameLeaderboards.get(gameID).values()) {
            if (leaderboard.isActive()) {
                leaderboard.submitScore(new ScoreEntry(userID, score));
            }
        }
    }

    // Method to list players next to a given user
    public List<ScoreEntry> listPlayersNext(String gameID, String leaderboardID, int userID, int nPlayers) {

        List<ScoreEntry> leaderboardEntries = new ArrayList<>();

        for (Map<String, Leaderboard> leaderboards : gameLeaderboards.values()) {
            if (leaderboards.containsKey(leaderboardID)) {
                leaderboardEntries.addAll(leaderboards.get(leaderboardID).listPlayers(userID, nPlayers, true));
                break;
            }
        }

        return leaderboardEntries;
    }

    // Method to list players next to a given user
    public List<ScoreEntry> listPlayersPrev(String gameID, String leaderboardID, int userID, int nPlayers) {

        List<ScoreEntry> leaderboardEntries = new ArrayList<>();

        for (Map<String, Leaderboard> leaderboards : gameLeaderboards.values()) {
            if (leaderboards.containsKey(leaderboardID)) {
                leaderboardEntries.addAll(leaderboards.get(leaderboardID).listPlayers(userID, nPlayers, false));
                break;
            }
        }

        return leaderboardEntries;
    }
}
