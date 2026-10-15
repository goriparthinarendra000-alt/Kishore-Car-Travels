public class ShowBookings {
    public static void main(String[] args) {
        BookingRequest first = new BookingRequest("Ravi", "Dokiparru", "Vijayawada", "Dzire");
        BookingRequest second = new BookingRequest("Suma", "Dokiparru", "Hyderabad", "Ertiga");

        System.out.println("New requests:");
        first.printDetails();
        second.printDetails();

        first.confirm();
        second.reject();

        System.out.println("After the owner decides:");
        first.printDetails();
        second.printDetails();
    }
}