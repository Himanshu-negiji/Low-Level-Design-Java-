package CarRentalSystem;

import CarRentalSystem.Enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStore(vehicles);

        User user = users.getFirst();

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(stores, users);

        Location location = new Location("Bangalore", "Karnataka", "India");
        Store store = vehicleRentalSystem.get_store(location);

        List<Vehicle> storeVehicles = store.getVehicle();
        Reservation reservation = store.addReservation(storeVehicles.getFirst(), user);

        Bill bill = new Bill(reservation);

        Payment payment = new Payment();
        payment.processPayment(bill);
    }

    private static List<User> addUsers() {
        return List.of(
                new User(1, "John Doe", "11111"),
                new User(2, "Andrew Smith", "10101")
        );
    }

    private static List<Vehicle> addVehicles() {
        return List.of(
                new Vehicle(1, "UK07 3555", VehicleType.CAR),
                new Vehicle(2, "UK07 1221", VehicleType.CAR)
        );
    }

    private static List<Store> addStore(List<Vehicle> vehicles) {
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId = 1;
        store1.setVehicle(vehicles);
        stores.add(store1);
        return stores;
    }
}
