package CarRentalSystem;

public class Bill {
    Reservation reservation;

    boolean isPaid;
    double totalAmount;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.isPaid = false;
        this.totalAmount = calculateTotalAmount();
    }

    private double calculateTotalAmount() {
        // We can add our own logic to calculate the total amount
        return 100.0;
    }
}
