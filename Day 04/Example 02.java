class Car {

    String model;
    int year;

    // No-arg Constructor
    Car(){
        model = "Toyota";
        year = 2026;
    }

    void display(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.display();
    }
}
