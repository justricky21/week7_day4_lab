import Player.Fighter.Knight;
import Player.Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight1;
    Sword sword1;

    @Before
    public void before(){
        knight1 = new Knight("Arthur");
        sword1 = new Sword();
    }

    @Test
    public void hasName(){
        assertEquals("Arthur", knight1.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(10, knight1.getHitPoints());
    }
}
