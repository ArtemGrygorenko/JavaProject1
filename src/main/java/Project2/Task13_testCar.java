package Project2;

public class Task13_testCar {
    public static void main(String[] args) {
        // Test Truck
        Truck truck = new Truck(60000, "black", 2250);
        System.out.println("Truck sale price= $" + truck.calculateSalePrice());

        // Test Sedan
        Sedan sedan = new Sedan(35000, "green", 19);
        System.out.println("Sedan sale price= $" + sedan.calculateSalePrice());
    }
}
