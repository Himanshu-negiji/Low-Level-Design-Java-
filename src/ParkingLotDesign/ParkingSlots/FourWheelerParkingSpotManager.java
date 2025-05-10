package ParkingLotDesign.ParkingSlots;

import java.util.ArrayList;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {

    public FourWheelerParkingSpotManager(ArrayList<ParkingSpot> parkingSpots) {
        super(parkingSpots);
    }

    @Override
    ParkingSpot findParkingSpace() {
        return null;
    }
}
