package Vehicle;

import Parking.ParkingSpotType;

public class MotorBike extends Vehicle {

    MotorBike(String vehicleNo) {
        super(vehicleNo, VehicleType.MOTORBIKE);
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return ParkingSpotType.TWO_WHEELER;
    }
}
