package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Vehicle vehicle = new SportsVehicle();
        System.out.println("object" + vehicle);
        vehicle.drive();
    }
}
