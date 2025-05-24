package CarRentalSystem;

import CarRentalSystem.Enums.VehicleType;

import java.util.List;

public class Vehicle {
    int id;
    String vehicleNumber;
    VehicleType vehicleType;

    public Vehicle(int id, String vehicleNumber, VehicleType vehicleType) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

}
