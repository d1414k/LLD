package leaderboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class Leaderboard {
    private final String id;
    private final long startEpochSeconds;
    private final long endEpochSeconds;
    // sorted map
    private final ConcurrentSkipListSet<ScoreEntry> entries = new ConcurrentSkipListSet<>();

    public Leaderboard(long startEpochSeconds, long endEpochSeconds) {
        this.id = UUID.randomUUID().toString();
        this.startEpochSeconds = startEpochSeconds;
        this.endEpochSeconds = endEpochSeconds;
    }

    public String getId() {
        return id;
    }

    public boolean isActive() {
        long currentTime = System.currentTimeMillis();
        return currentTime >= startEpochSeconds && currentTime <= endEpochSeconds;
    }

    public void submitScore(ScoreEntry scoreEntry) {
        addEntry(scoreEntry);
    }

    public List<ScoreEntry> getEntries() {
        return new ArrayList<>(entries);
    }

    private void addEntry(ScoreEntry newEntry) {
        boolean userExists = false;
        for (ScoreEntry entry : entries) {
            if (entry.getUserID() == newEntry.getUserID()) {
                userExists = true;
                if (newEntry.getScore() > entry.getScore()) {
                    entry.setScore(newEntry.getScore());
                }
                break;
            }
        }
        if (!userExists) {
            entries.add(newEntry);
        }
    }

    public List<ScoreEntry> listPlayers(int userID, int nPlayers, boolean isGreater) {
        int score = 0;
        for (ScoreEntry entry : entries) {
            if (entry.getUserID() == userID) {
                score = entry.getScore();
            }
        }

        List<ScoreEntry> res = new ArrayList<>();
        for (ScoreEntry entry : entries) {
            if (isGreater) {
                if (entry.getScore() > score)
                    res.add(entry);
            } else {
                if (entry.getScore() < score)
                    res.add(entry);
            }
        }
        return res;
    }
}
