package ParkingLotDesign.ParkingSlots;

import ParkingLotDesign.Vehicle;

import java.util.ArrayList;

abstract class ParkingSpotManager {
    ArrayList<ParkingSpot> parkingSpots;

    public ParkingSpotManager(ArrayList<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    abstract ParkingSpot findParkingSpace();

    private void parkVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = findParkingSpace();
        parkingSpot.parkVehicle(vehicle);
    }

    private void removeVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = findParkingSpace();
        parkingSpot.removeVehicle(vehicle);
    }


}
