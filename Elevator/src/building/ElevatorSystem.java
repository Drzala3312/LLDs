package building;

import java.util.PriorityQueue;

public class ElevatorSystem {
    private Building building;
    Dispatcher dispather;
    PriorityQueue<Request> upRequests;
    PriorityQueue<Request> downRequests;

    public void monitoring() {
    }

    private ElevatorSystem() {
    }

    private static ElevatorSystem system = null;

    public static ElevatorSystem getInstance() {
        if (system == null)
            system = new ElevatorSystem();
        return system;
    }
}
