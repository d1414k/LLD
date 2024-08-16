package leaderboard;

import java.util.List;

public class LeaderServiceDemo {
    public static void main(String[] args) {
        LeaderboardService service = new LeaderboardService();

        // Create some games and leaderboards
        String gameID = "game1";
        String leaderboardID = service.createLeaderboard(gameID, System.currentTimeMillis(),
                System.currentTimeMillis() + 200000); // Example epoch times

        // Submit scores
        service.submitScore(gameID, 1, 100);
        service.submitScore(gameID, 2, 200);
        service.submitScore(gameID, 3, 150);
        service.submitScore(gameID, 1, 50); // submit lesser score, should be not added again

        // Fetch leaderboard
        System.out.println("Leaderboard: ");
        List<ScoreEntry> leaderboard = service.getLeaderboard(leaderboardID);
        for (ScoreEntry entry : leaderboard) {
            System.out.println(entry);
        }

        // List players next and previous to a user
        System.out.println("Next Players of " + 1);
        List<ScoreEntry> nextPlayers = service.listPlayersNext(gameID, leaderboardID,
                1, 5);
        for (ScoreEntry entry : nextPlayers) {
            System.out.println(entry);
        }

        System.out.println("Prev Players of " + 3);
        List<ScoreEntry> prevPlayers = service.listPlayersPrev(gameID, leaderboardID,
                3, 5);
        for (ScoreEntry entry : prevPlayers) {
            System.out.println(entry);
        }
    }
}

/*
 * Leaderboard:
 * ScoreEntry [userID=2, score=200]
 * ScoreEntry [userID=3, score=150]
 * ScoreEntry [userID=1, score=100]
 * Next Players of 1
 * ScoreEntry [userID=2, score=200]
 * ScoreEntry [userID=3, score=150]
 * Prev Players of 3
 * ScoreEntry [userID=1, score=100]
 */
