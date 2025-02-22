package WithStrategyPattern.Strategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is a special drive strategy");
    }
}
