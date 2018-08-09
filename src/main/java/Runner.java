import Enemy.Orc;
import Player.Fighter.Barbarian;
import Player.Weapon.Axe;

public class Runner {

    public static void main(String[] args) {
        Barbarian barbarian = new Barbarian("Grognak");
        Axe axe = new Axe();
        barbarian.setWeapon(axe);
        Orc orc = new Orc();
        barbarian.attackWithWeapon(orc);
        System.out.println("HOLY SHIT, " + barbarian.getName() + " just did "+barbarian.getWeapon().attack()+ " damage to the " + orc.getReadableName() + "! The " + orc.getReadableName() + " now has " + orc.getHitPoints() + " hit points!");
    }
}
