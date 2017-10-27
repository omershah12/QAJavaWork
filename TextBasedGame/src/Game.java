import java.util.HashMap;

public abstract class Game {

    public HashMap<Integer, String> progress = new HashMap<>();

    public boolean isComplete;

    public int level;

    public int distance=70;


    public HashMap<Integer, String> getProgress() {
        return progress;
    }

    public boolean getisComplete() {
        return isComplete;
    }

    public int getLevel() {
        return level;
    }

    public int getDistance() {
        return distance;
    }
}
