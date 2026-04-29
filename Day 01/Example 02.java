class Car {

    String brand;

    // Constructor
    Car(String brand) {
        this.brand = brand;
    }

    // Method
    void start() {
        System.out.println(brand + " Car Starts.");
    }
}

// Child Class
class SportsCar extends Car {

    SportsCar(String brand) {
        super(brand);
    }

    // Polymorphism 
    void start() {
        System.out.println(brand + " Sports Car Starts Very Fast!");
    }
}

// Main Class
public class IT24013 {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new SportsCar("Ferrari");

        car1.start();
        car2.start();
    }
}
