package Enemy;

public abstract class Enemy {
    protected int hitPoints;

    public Enemy() {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void takeDamage(int attack){
        this.hitPoints -= attack;
    }


}
