import java.util.ArrayList;

public class VehicleList {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("Suzuki Swift", 5, 10.0));
        vehicles.add(new Vehicle("Dzire", 5, 11.0));
        vehicles.add(new Vehicle("Ertiga", 7, 14.0));

        System.out.println("Total vehicles: " + vehicles.size());

        for (Vehicle v : vehicles) {
            v.printDetails();
        }
    }
}