package Parking;

import java.time.LocalDateTime;
import java.util.UUID;

import Vehicle.Vehicle;

public class EntryPanel {
    String entryId;

    ParkingTicket generateParkingTicket(Vehicle vehicle) {
        try {
            ParkingSpot getSpot = ParkingLot.getInstance(null).getAvailableParkingSpot(vehicle.getParkingSpotType());
            return new ParkingTicket(UUID.randomUUID().toString(), LocalDateTime.now(), getSpot);
        } catch (ParkingFullException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
