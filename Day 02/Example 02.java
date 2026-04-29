final class Vehicle {

    final int maxSpeed = 120;

    final void displayMaxSpeed(){
        System.out.println("Max Speed: " + maxSpeed);
    }
}

abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw(){
        System.out.println("Drawing Circle");
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.displayMaxSpeed();

        Circle c = new Circle();
        c.draw();
    }
}
