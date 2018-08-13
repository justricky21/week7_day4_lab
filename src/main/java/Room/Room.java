package Room;



import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Room {

    private ArrayList<Exit> exits;

    public Room() {
        this.exits = new ArrayList<>();
        addExits();
    }

    private void addExits(){
        int randNum = ThreadLocalRandom.current().nextInt(0, 4);
        int i = 0;
        switch(randNum){
            case 0: break;
            case 1: addNewExit();
            case 2: while (i < 2) {addNewExit(); i++;}
            case 3: while (i < 3) {addNewExit(); i++;}
        }
    }

    public void addSpecificExit(Exit exit){
        exits.add(exit);
    }

    public boolean hasAnyExits(){
        return !(exits.isEmpty());
    }

    public void addNewExit() {
        int randNum = ThreadLocalRandom.current().nextInt(0, 4);
        Exit[] exitsToChooseFrom = Exit.values();
        Exit chosenExit = exitsToChooseFrom[randNum];

        if (!(exits.contains(chosenExit))) {
            exits.add(chosenExit);
        } else {
            addNewExit();
        }
    }

    public Exit newRoomExit(Exit exit){
        switch(exit){
            case NORTH: return Exit.SOUTH;
            case EAST: return Exit.WEST;
            case SOUTH: return Exit.NORTH;
            case WEST: return Exit.EAST;
            default: return null;
        }
    }

}
