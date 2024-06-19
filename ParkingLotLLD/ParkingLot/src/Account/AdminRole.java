package Account;

import java.util.List;

import Parking.ParkingFloor;
import Parking.ParkingLot;
import Parking.ParkingSpot;

public class AdminRole extends Account {

    void addFloor(String floorid) {
        ParkingLot.getInstance(null).getListParkingFloor().add(new ParkingFloor(floorid));
    }

    void addParkingSpot(String floorid, List<ParkingSpot> parkingSpots) {
        ParkingFloor parkingFloor = ParkingLot.getInstance(null).getListParkingFloor()
                .stream().filter(floor -> floor.getFloorId() == floorid).findFirst().get();
        parkingSpots.stream().forEach(parkingSpot -> {
            parkingFloor.getAvailable().get(parkingSpot.getParkingSpotType()).add(parkingSpot);
        });
    }

}
