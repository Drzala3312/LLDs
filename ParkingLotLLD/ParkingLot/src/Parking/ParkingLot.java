package Parking;

import java.util.ArrayList;
import java.util.List;

import Account.Address;

/**
 * ParkingLot
 */

public class ParkingLot {
    Address address;
    List<ParkingFloor> listParkingFloor;
    List<EntryPanel> listEntry;
    List<ExitPanel> listExit;

    public Address getAddress() {
        return address;
    }

    public List<ParkingFloor> getListParkingFloor() {
        return listParkingFloor;
    }

    public synchronized ParkingSpot getAvailableParkingSpot(ParkingSpotType parkingSpotType)
            throws ParkingFullException {
        return null;
    }

    public List<EntryPanel> getListEntry() {
        return listEntry;
    }

    public List<ExitPanel> getListExit() {
        return listExit;
    }

    private static ParkingLot parkingLot;

    private ParkingLot() {

    }

    private ParkingLot(Address address) {
        this.address = address;
        this.listParkingFloor = new ArrayList<>();
        this.listEntry = new ArrayList<>();
        this.listExit = new ArrayList<>();
    }

    public static ParkingLot getInstance(Address address) {
        if (parkingLot == null) {
            parkingLot = new ParkingLot(address);
        }

        return parkingLot;
    }
}