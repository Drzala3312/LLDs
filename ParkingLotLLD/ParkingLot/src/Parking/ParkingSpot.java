package Parking;

public abstract class ParkingSpot {
    String spotId;
    ParkingSpotType parkingSpotType;

    ParkingSpot(String spotId, ParkingSpotType parkingSpotType) {
        this.spotId = spotId;
        this.parkingSpotType = parkingSpotType;
    }

    public String getSpotId() {
        return spotId;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
}
