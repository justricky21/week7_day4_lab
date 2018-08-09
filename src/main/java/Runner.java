import Enemy.Orc;
import Player.Defender.Wolf;
import Player.Fighter.Barbarian;
import Player.Mage.Druid;
import Player.Weapon.Axe;

public class Runner {

    public static void main(String[] args) {
        Druid druid = new Druid("Getafix");
        Wolf wolf = new Wolf();
        druid.setDefend(wolf);
        Barbarian barbarian = new Barbarian("Grognak");
        Axe axe = new Axe();
        barbarian.setWeapon(axe);
        Orc orc = new Orc();
        barbarian.attackWithWeapon(orc);
        System.out.println("HOLY SHIT, " + barbarian.getName() + " just did "+barbarian.getWeapon().attack()+ " damage to the " + orc.getReadableName() + "! The " + orc.getReadableName() + " now has " + orc.getHitPoints() + " hit points!");
        druid.defendWithDefender(orc);
        System.out.println("HOLY SHIT, " + druid.getName() + "'s defender just did "+ druid.getDefend().defend()+ " damage to the " + orc.getReadableName() + "! The " + orc.getReadableName() + " now has " + orc.getHitPoints() + " hit points!");
    }


}
