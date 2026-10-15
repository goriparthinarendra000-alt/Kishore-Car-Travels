public class ShowVehicles {
    public static void main(String[] args) {
        Vehicle swift = new Vehicle("Suzuki Swift", 5, 10.0);
        Vehicle dzire = new Vehicle("Dzire", 5, 11.0);
        Vehicle ertiga = new Vehicle("Ertiga", 7, 14.0);

        swift.printDetails();
        dzire.printDetails();
        ertiga.printDetails();
    }
}