package Player.Defender;

import Player.Interfaces.IDefend;

public class Crocodile implements IDefend {
    int damage;
    public Crocodile() {
        this.damage = 4;
    }

    public int defend(){
        return this.damage;
    }
}
