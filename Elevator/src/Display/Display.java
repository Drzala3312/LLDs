package Display;

import Elevator.State;

public abstract class Display {
    int displayID;
    int floorNum;
    Direction direction;

    public abstract void display();
}
