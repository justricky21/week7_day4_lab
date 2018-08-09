package Player.Defender;

import Player.Interfaces.IDefend;

public class BlinkDog implements IDefend {
    int damage;
    public BlinkDog() {
        this.damage = 3;
    }

    public int defend(){
        return this.damage;
    }
}
