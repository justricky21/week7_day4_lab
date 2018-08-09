import Player.Fighter.Barbarian;
import Player.Weapon.Axe;
import Player.Weapon.Spear;
import Player.Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian1;
    Axe axe1;

    @Before
    public void before(){
        barbarian1 = new Barbarian("Grognak");
        axe1 = new Axe();
    }

    @Test
    public void hasName(){
        assertEquals("Grognak", barbarian1.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(12, barbarian1.getHitPoints());
    }

    @Test
    public void hasWeapon(){
        barbarian1.setWeapon(axe1);
        assertEquals(axe1, barbarian1.getWeapon());
    }

    @Test
    public void canAttack(){
        barbarian1.setWeapon(axe1);
        assertEquals(4, barbarian1.attackWithWeapon());
    }

    @Test
    public void canChangeWeapon(){
        Sword sword1 = new Sword();
        barbarian1.setWeapon(axe1);
        barbarian1.setWeapon(sword1);
        assertEquals(5, barbarian1.attackWithWeapon());
    }

    @Test
    public void swordDealsDamage(){
        Sword sword1 = new Sword();
        barbarian1.setWeapon(sword1);
        assertEquals(5, barbarian1.attackWithWeapon());
    }

    @Test
    public void spearDealsDamage(){
        Spear spear1 = new Spear();
        barbarian1.setWeapon(spear1);
        assertEquals(3, barbarian1.attackWithWeapon());
    }

}
