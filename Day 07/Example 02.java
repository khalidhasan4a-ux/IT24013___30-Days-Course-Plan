abstract class Shape {

    abstract void draw();

    void display(){
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {

    void draw(){
        System.out.println("Drawing Circle");
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Shape shape = new Circle();

        shape.draw();
        shape.display();
    }
}
