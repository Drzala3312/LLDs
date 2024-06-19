package Parking;

import java.time.LocalDateTime;

public class ParkingTicket {
    String ticketId;
    LocalDateTime startTime;
    LocalDateTime endTime;
    double finalAmount;
    ParkingSpot parkingSpot;

    public ParkingTicket(String ticketId, LocalDateTime startTime, ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.startTime = startTime;
        this.parkingSpot = parkingSpot;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

}
