package Parking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    public String getFloorId() {
        return floorId;
    }

    public Map<ParkingSpotType, List<ParkingSpot>> getOccupied() {
        return occupied;
    }

    public Map<ParkingSpotType, List<ParkingSpot>> getAvailable() {
        return available;
    }

    String floorId;
    Map<ParkingSpotType, List<ParkingSpot>> occupied = new HashMap<>();
    Map<ParkingSpotType, List<ParkingSpot>> available = new HashMap<>();

    public ParkingFloor(String floorid) {
        this.floorId = floorid;
    }
}
