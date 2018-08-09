import Enemy.Orc;
import Player.Defender.BlinkDog;
import Player.Defender.Crocodile;
import Player.Defender.Wolf;
import Player.Mage.Druid;
import Player.Spell.Fireball;
import Player.Spell.Frogify;
import Player.Spell.LightningBolt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DruidTest {

    Druid druid1;
    Wolf wolf1;
    Fireball fireball1;
    Orc orc1;


    @Before
    public void before(){
        druid1 = new Druid("Getafix");
        wolf1 = new Wolf();
        fireball1 = new Fireball();
        orc1 = new Orc();
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

    @Test
    public  void canCastSpell(){
        druid1.setSpell(fireball1);
        assertEquals("Boom!!!", druid1.castSpell());
    }

    @Test
    public void canDefend(){
        druid1.setDefend(wolf1);
        druid1.defendWithDefender(orc1);

        assertEquals(13, orc1.getHitPoints());
    }

    @Test
    public void canChangeSpell(){
        Frogify frog1 = new Frogify();
        druid1.setSpell(fireball1);
        druid1.setSpell(frog1);
        assertEquals("Croak!", druid1.castSpell());
    }

    @Test
    public void canCastFrogify(){
        Frogify frog1 = new Frogify();
        druid1.setSpell(frog1);
        assertEquals("Croak!", druid1.castSpell());
    }

    @Test
    public void canCastLightningBolt(){
        LightningBolt lightning1 = new LightningBolt();
        druid1.setSpell(lightning1);
        assertEquals("Kablum!!!", druid1.castSpell());
    }

    @Test
    public void canChangeDefender(){
        Crocodile crocodile1 = new Crocodile();
        druid1.setDefend(wolf1);
        druid1.setDefend(crocodile1);
        druid1.defendWithDefender(orc1);
        assertEquals(11, orc1.getHitPoints());
    }

    @Test
    public void crocodileCanDefend(){
        Crocodile crocodile1 = new Crocodile();
        druid1.setDefend(crocodile1);
        druid1.defendWithDefender(orc1);
        assertEquals(11, orc1.getHitPoints());
    }

    @Test
    public void blinkDogCanDefend(){
        BlinkDog blinkDog1 = new BlinkDog();
        druid1.setDefend(blinkDog1);
        druid1.defendWithDefender(orc1);
        assertEquals(12, orc1.getHitPoints());
    }
}
