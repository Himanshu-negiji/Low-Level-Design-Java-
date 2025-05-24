package CarRentalSystem;

import CarRentalSystem.Enums.ReservationStatus;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement vehicleInventoryManagement;
    Location storeLocation;
    List<Reservation> reservationList = new ArrayList<>();

    public List<Vehicle> getVehicle() {
        return vehicleInventoryManagement.vehicleList;
    }

    public void setVehicle(List<Vehicle> vehicleList) {
        this.vehicleInventoryManagement = new VehicleInventoryManagement(vehicleList);
    }

    public Reservation addReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.user = user;
        reservation.vehicle = vehicle;
        reservation.reservationStatus = ReservationStatus.PENDING;
        reservationList.add(reservation);
        return reservation;
    }
}
