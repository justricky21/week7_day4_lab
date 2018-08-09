package Player;

public abstract class Player {
    protected int hitPoints;
    protected String name;

    public Player(String name) {
        this.hitPoints = hitPoints;
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }
}
