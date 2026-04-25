Date : 20/04/2025

Day #01

Topic : Class, Object, Properties, Methods, Inheritance + Encapsulation + Polymorphism

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plane/tree/main/Day%2001

Video : https://www.youtube.com/watch?v=s2hoJkIz3RQ

Example #01

// Code 1: Class, Object, Properties, Methods

class Student {
    // Properties (Attributes)
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Assigning values
        s1.name = "Jadid";
        s1.age = 20;

        // Calling method
        s1.displayInfo();
    }
}


Example #02

// Code 2: Inheritance, Encapsulation, Polymorphism

class Animal {

    // Encapsulation (private variable)
    private String name;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Method
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Inheritance
class Dog extends Animal {

    // Polymorphism (method overriding)
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        // Using encapsulation
        d1.setName("Tommy");

        System.out.println("Dog Name: " + d1.getName());

        // Polymorphism
        d1.sound();
    }
}







Date : 21/04/2025

Day #02

Topic : Access Modifiers (public, private, protected, default), Non-Access Modifiers (static, final, abstract)

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2002

Video : https://www.youtube.com/watch?v=lWFzm8qIR1c


Example #01

// Code 1: Access Modifiers Example

class Student {

    public String name;        // Public (anywhere access)
    private int age;           // Private (only inside class)
    protected String school;   // Protected (same package + subclass)
    String city;               // Default (same package)

    // Setter for private variable
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for private variable
    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + school);
        System.out.println("City: " + city);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Jadid";     // public
        s1.setAge(20);         // private via setter
        s1.school = "XYZ School"; // protected
        s1.city = "Dhaka";     // default

        s1.display();
    }
}



Example #02


// Code 2: static, final, abstract Example

abstract class Shape {

    // Abstract method (must be implemented)
    abstract void draw();

    // Static method
    static void info() {
        System.out.println("This is Shape class");
    }
}

class Circle extends Shape {

    final double PI = 3.1416; // Final (constant)

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    void draw() {
        System.out.println("Drawing Circle");
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        // Static method call
        Shape.info();

        Circle c1 = new Circle(5);
        c1.draw();
    }
}





Date : 22/04/2025

Day #03

Topic : Encapsulation (Basic Example), Encapsulation + Access Modifiers (Full Example)

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2003

Video : https://www.youtube.com/watch?v=HZUUYnIZO_0


Example #01

// Code 1: Encapsulation Example

class BankAccount {

    // Private variable (hidden data)
    private double balance;

    // Setter method (deposit money)
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    // Getter method (check balance)
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(1000); // add money

        System.out.println("Balance: " + acc.getBalance());
    }
}



Example #02

// Code 2: Encapsulation + Access Modifiers

class Student {

    private String name;     // private
    private int age;         // private

    public String university;    // public
    protected String city;   // protected
    String country;          // default

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University: " + university);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        // Using setters
        s1.setName("Khalid");
        s1.setAge(23);

        // Direct access (allowed ones)
        s1.university = "MBSTU";
        s1.city = "Tangail";
        s1.country = "Bangladesh";

        s1.display();
    }
}



Date : 23/04/2025

Day #04

Topic : Default / No-Argument Constructor, Parameterized Constructor

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2004

Video : https://www.youtube.com/watch?v=acfR5vRTZvc



Example #01


class Student {

    String name;
    int age;

    // No-argument constructor
    Student() {
        name = "Khalid";
        age = 23;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Constructor automatically called
        Student s1 = new Student();

        s1.display();
    }
}




Example #02


// Code 2: Parameterized Constructor

class Car {

    String color;
    int speed;

    // Parameterized constructor
    Car(String c, int s) {
        color = c;
        speed = s;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {

        // Passing values during object creation
        Car c1 = new Car("Red", 120);
        Car c2 = new Car("Blue", 100);

        c1.display();
        System.out.println("------");
        c2.display();
    }
}





Date : 24/04/2025

Day #05

Topic : Single Inheritance + Method Overriding, Multilevel + Hierarchical Inheritance

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2005

Video : https://www.youtube.com/watch?v=j_VA2Rp6jM0


Example #01


// Code 1: Single Inheritance

class Animal {

    String name = "Animal";

    void eat() {
        System.out.println(name + " is eating");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        // Inherited method
        d1.eat();

        // Overridden method
        d1.sound();
    }
}




Example #02


// Code 2: Multilevel and Hierarchical Inheritance

class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

// Multilevel Inheritance
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

        Puppy p1 = new Puppy();

        p1.eat();   // from Animal
        p1.bark();  // from Dog
        p1.weep();  // own method

        System.out.println("------");

        Cat c1 = new Cat();

        c1.eat();   // from Animal
        c1.meow();  // own method
    }
}

