package Player.Fighter;

import Enemy.Enemy;
import Player.Interfaces.IWeapon;
import Player.Player;

public abstract class Fighter extends Player {
    private IWeapon weapon;
    public Fighter(String name) {
        super(name);
        this.weapon = null;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attackWithWeapon(Enemy enemy){
        enemy.takeDamage(weapon.attack());
    }
}
