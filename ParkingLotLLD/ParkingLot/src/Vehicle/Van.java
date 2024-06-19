package Vehicle;

import Parking.ParkingSpotType;

public class Van extends Vehicle {

    Van(String vehicleNo) {
        super(vehicleNo, VehicleType.VAN);
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return ParkingSpotType.FOUR_WHEELER;
    }

}
