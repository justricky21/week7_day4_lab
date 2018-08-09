package Enemy;

public abstract class Enemy {
    protected int hitPoints;
    protected String readableName;
    public Enemy() {
        this.hitPoints = hitPoints;
        this. readableName = readableName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getReadableName() {
        return readableName;
    }

    public void takeDamage(int attack){
        this.hitPoints -= attack;
    }


}
