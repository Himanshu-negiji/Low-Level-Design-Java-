package CarRentalSystem;

import CarRentalSystem.Enums.ReservationStatus;
import CarRentalSystem.Enums.ReservationType;

import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date reservationDate;
    Date fromDate;
    Date toDate;
    Location pickupLocation;
    Location dropLocation;
    ReservationStatus reservationStatus;
    ReservationType reservationType;

}
