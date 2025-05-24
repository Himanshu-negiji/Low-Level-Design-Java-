package CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    int userID;
    String name;
    String email;
    String phoneNumber;
    String drivingLicenseNumber;

    public User(int userID, String name, String drivingLicenseNumber) {
        this.userID = userID;
        this.name = name;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
}
