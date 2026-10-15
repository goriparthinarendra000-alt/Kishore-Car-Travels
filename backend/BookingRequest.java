public class BookingRequest {
    String customerName;
    String pickup;
    String drop;
    String vehicleName;
    String status;

    BookingRequest(String customerName, String pickup, String drop, String vehicleName) {
        this.customerName = customerName;
        this.pickup = pickup;
        this.drop = drop;
        this.vehicleName = vehicleName;
        this.status = "PENDING";
    }

    void confirm() {
        this.status = "CONFIRMED";
    }

    void reject() {
        this.status = "REJECTED";
    }

    void printDetails() {
        System.out.println(customerName + " | " + pickup + " to " + drop
                + " | " + vehicleName + " | Status: " + status);
    }
}