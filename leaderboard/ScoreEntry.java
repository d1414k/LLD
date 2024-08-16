package leaderboard;

import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

public class ScoreEntry implements Comparable<ScoreEntry> {
    private int userID;
    private int score;

    public ScoreEntry(int userID, int score) {
        this.userID = userID;
        this.score = score;
    }

    public int getUserID() {
        return userID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(ScoreEntry other) {
        return Integer.compare(other.score, this.score);
    }

    @Override
    public String toString() {
        return "ScoreEntry [userID=" + userID + ", score=" + score + "]";
    }

}
