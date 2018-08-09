import Enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {
    Orc orc;

    @Before
    public void before(){
        orc = new Orc();
    }

    @Test
    public void orcHasHP(){
        assertEquals(15, orc.getHitPoints());
    }

    @Test
    public void hasReadableName(){
        assertEquals("Orc", orc.getReadableName());
    }
    @Test
    public void orcCanBeHurt(){
        orc.takeDamage(5);
        assertEquals(10, orc.getHitPoints());
    }
}
