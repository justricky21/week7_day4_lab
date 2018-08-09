import Player.Fighter.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian1;
    //Axe axe1;

    @Before
    public void before(){
        barbarian1 = new Barbarian("Grognak");
        //axe1 = new Axe();
    }

    @Test
    public void hasName(){
        assertEquals("Grognak", barbarian1.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(12, barbarian1.getHitPoints());
    }

//    @Test
//    public void hasWeapon(){
//
//    }
//
//    @Test
//    public void canAttack(){
//
//    }
}
