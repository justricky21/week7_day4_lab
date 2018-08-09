package Player.Fighter;

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

    public String attackWithWeapon(){
        return this.weapon.attack();
    }
}
