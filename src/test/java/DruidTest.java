import Player.Defender.Wolf;
import Player.Mage.Druid;
import Player.Spell.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DruidTest {

    Druid druid1;
    Wolf wolf1;
    Fireball fireball1;


    @Before
    public void before(){
        druid1 = new Druid("Getafix");
        wolf1 = new Wolf();
        fireball1 = new Fireball();
    }

    @Test
    public void hasASpell(){
        druid1.setSpell(fireball1);
        assertEquals(fireball1, druid1.getSpell());
    }

    @Test
    public void hasADefender(){
        druid1.setDefend(wolf1);
        assertEquals(wolf1, druid1.getDefend());
    }

//    @Test
//    public  void canCastSpell(){
//
//    }
//
//    @Test
//    public void canDefend(){
//
//    }
}
