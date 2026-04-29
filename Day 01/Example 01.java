class Car {

    // Properties
    String brand;
    String color;
    int speed;

    // Constructor
    Car(String b, String c, int s) {
        brand = b;
        color = c;
        speed = s;
    }

    // Method
    void displayInfo() {
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Color : " + color);
        System.out.println("Car Speed : " + speed + " km/h");
    }
}

// Main Class
public class IT24013 {

    public static void main(String[] args) {

        // Creating Objects
        Car car1 = new Car("Toyota", "Red", 120);
        Car car2 = new Car("BMW", "Black", 180);

        System.out.println("Car 1 Information:");
        car1.displayInfo();

        System.out.println();

        System.out.println("Car 2 Information:");
        car2.displayInfo();
    }
}
