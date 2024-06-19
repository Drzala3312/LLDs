package Vehicle;

import Parking.ParkingSpotType;

public class Car extends Vehicle {

    Car(String vehicleNo) {
        super(vehicleNo, VehicleType.CAR);

    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return ParkingSpotType.FOUR_WHEELER;
    }

}
