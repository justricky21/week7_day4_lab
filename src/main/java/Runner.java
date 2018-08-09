import Player.Fighter.Barbarian;
import Player.Weapon.Axe;

public class Runner {

    public static void main(String[] args) {
        Barbarian barbarian = new Barbarian("Grognak");
        Axe axe = new Axe();
        barbarian.setWeapon(axe);
        
    }
}
