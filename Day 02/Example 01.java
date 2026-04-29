class Car {

    // Default Access
    String model;

    // Private Access
    private String color;

    // Protected Access
    protected int year;

    // Static Variable
    static int numberOfCars = 0;

    // Constructor
    Car(String m, String c, int y){
        model = m;
        color = c;
        year = y;
        numberOfCars++;
    }

    void displayInfo(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }

    static void displayCount(){
        System.out.println("Total Cars: " + numberOfCars);
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Red", 2020);
        Car car2 = new Car("BMW", "Black", 2022);

        car1.displayInfo();

        System.out.println();

        car2.displayInfo();

        System.out.println();

        Car.displayCount();
    }
}
