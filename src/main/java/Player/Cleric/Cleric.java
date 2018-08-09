package Player.Cleric;

import Player.Interfaces.IHeal;
import Player.Player;

public class Cleric extends Player {

    private IHeal medicine;
    public Cleric(String name) {
        super(name);
        medicine = null;
    }

    public IHeal getMedicine() {
        return medicine;
    }

    public void setMedicine(IHeal medicine) {
        this.medicine = medicine;
    }

    public void useMedicine(Player player){
        int newHealth = (player.getHitPoints() + medicine.heal());
        player.setHitPoints(newHealth);
    }
}
