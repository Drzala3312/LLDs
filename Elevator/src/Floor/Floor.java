package Floor;

import java.util.List;

import Display.FloorDisplay;
import Elevator.Elevator;
import Panel.FloorPanel;

public class Floor {
    int floorID;
    List<Elevator> elevators;
    List<FloorPanel> panels;
    List<FloorDisplay> display;

    boolean isTopMost() {
        return true;
    }

    boolean isGroundFloor() {
        return false;
    }
}
