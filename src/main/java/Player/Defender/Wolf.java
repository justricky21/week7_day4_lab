package Player.Defender;

import Player.Interfaces.IDefend;

public class Wolf implements IDefend {
    int damage;

    public Wolf() {
        this.damage = 2;
    }

    public int defend(){
        return this.damage;
    }
}
