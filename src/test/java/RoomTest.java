import Room.Room;
import org.junit.Before;
import org.junit.Test;

import static Room.Exit.NORTH;
import static Room.Exit.SOUTH;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoomTest {

    Room room1;

    @Before
    public void before(){
        room1 = new Room();
    }

    @Test
    public void roomHasExits(){
        room1.addSpecificExit(NORTH);
        assertTrue(room1.hasAnyExits());
    }

    @Test
    public void addRandomExit(){
        room1.addNewExit();
        assertTrue(room1.hasAnyExits());
    }

    @Test
    public void canDetermineNewExit(){
        assertEquals(NORTH, room1.newRoomExit(SOUTH));
    }

//    test discontinued due to room self initialization
//    @Test
//    public void canAddRandomRoom() {
//        int i = 0;
//        while (i < 4) {
//            room1.addNewExit();
//            i++;
//        }
//        assertEquals(4, room1.totalExits());
//    }
}
