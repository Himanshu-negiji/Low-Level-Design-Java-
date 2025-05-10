package ParkingLotDesign.ParkingSlots;

import java.util.ArrayList;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {

    public TwoWheelerParkingSpotManager(ArrayList<ParkingSpot> parkingSpots) {
        super(parkingSpots);
    }

    @Override
    ParkingSpot findParkingSpace() {
        return null;
    }
}
