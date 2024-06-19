package Vehicle;

import Parking.ParkingSpotType;
import Parking.ParkingTicket;

public abstract class Vehicle {
    String vehicleNo;
    VehicleType vehicleType;
    ParkingTicket parkingTicket;

    Vehicle(String vehicleNo, VehicleType vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    public abstract ParkingSpotType getParkingSpotType();

}
