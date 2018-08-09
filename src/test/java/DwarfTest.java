import Player.Fighter.Dwarf;
import Player.Weapon.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf1;
    Axe axe1;

    @Before
    public void before(){
        dwarf1 = new Dwarf("Gimli");
        axe1 = new Axe();
    }

    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf1.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(11, dwarf1.getHitPoints());
    }
}
