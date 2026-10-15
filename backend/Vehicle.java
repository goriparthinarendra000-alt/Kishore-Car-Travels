public class Vehicle {
    String name;
    int seats;
    double pricePerKm;

    Vehicle(String name, int seats, double pricePerKm) {
        this.name = name;
        this.seats = seats;
        this.pricePerKm = pricePerKm;
    }

    void printDetails() {
        System.out.println(name + " | Seats: " + seats + " | Price per km: Rs " + pricePerKm);
    }
}