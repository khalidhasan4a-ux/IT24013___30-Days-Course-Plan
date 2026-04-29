Date : 19/04/2025

Day #01

Topic : Class, Object, Properties, Methods, Inheritance + Encapsulation + Polymorphism

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plane/tree/main/Day%2001

Video : https://www.youtube.com/watch?v=s2hoJkIz3RQ

Example #01

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


Example #02

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

    // Polymorphism (Method Overriding)
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






Date : 20/04/2025

Day #02

Topic : Access Modifiers (public, private, protected, default), Non-Access Modifiers (static, final, abstract)

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2002

Video : https://www.youtube.com/watch?v=lWFzm8qIR1c


Example #01

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



Example #02


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






Date : 21/04/2025

Day #03

Topic : Person Class with Getter and Setter, Person Class with Validation

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2003

Video : https://www.youtube.com/watch?v=HZUUYnIZO_0


Example #01

class Person {

    // Private attributes
    private String name;
    private int age;

    // Constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getter methods
    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    // Setter methods
    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Person p = new Person("Khalid",20);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        p.setName("Jadid");
        p.setAge(23);

        System.out.println("Updated Name: " + p.getName());
        System.out.println("Updated Age: " + p.getAge());
    }
}


Example #02

class Person {

    private String name;
    private int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){

        if(age >= 0){
            this.age = age;
        }
        else{
            System.out.println("Age cannot be negative.");
        }
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Person p = new Person("Khalid",20);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        p.setAge(-5);   // Invalid value

        p.setAge(23);   // Valid value

        System.out.println("Updated Age: " + p.getAge());
    }
}







Date : 22/04/2025

Day #04

Topic : Dog Class (Default Constructor + Parameterized Constructor), Car Class (No-arg Constructor)

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2004

Video : https://www.youtube.com/watch?v=acfR5vRTZvc



Example #01


class Dog {

    String name;

    // Default Constructor
    Dog(){
        name = "Unknown";
    }

    // Parameterized Constructor
    Dog(String dogName){
        name = dogName;
    }

    void display(){
        System.out.println("Dog's Name: " + name);
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();          // Default constructor
        Dog dog2 = new Dog("Tommy");   // Parameterized constructor

        dog1.display();
        dog2.display();
    }
}



Example #02


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







Date : 23/04/2025

Day #05

Topic : Single Inheritance + Multilevel Inheritance, Method Overriding (Polymorphism)

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2005

Video : https://www.youtube.com/watch?v=j_VA2Rp6jM0


Example #01


class Animal {

    String name;

    void eat(){
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {

    void bark(){
        System.out.println(name + " says woof!");
    }
}

class Puppy extends Dog {

    void weep(){
        System.out.println(name + " is weeping.");
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.name = "Buddy";

        p.eat();
        p.bark();
        p.weep();
    }
}




Example #02


class Animal {

    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Dog();

        a1.sound();

        a2.sound();
    }
}





Date : 24/04/2025

Day #06

Topic : Compile-Time Polymorphism (Method Overloading), Runtime Polymorphism (Method Overriding)

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2006

Video : https://www.youtube.com/watch?v=bLke13zY4rg&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=7

Example #01


class MathOperations {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
}


public class IT24013 {

    public static void main(String[] args) {

        MathOperations math = new MathOperations();

        System.out.println("Sum of 2 and 3: " + math.add(2,3));

        System.out.println("Sum of 2,3 and 4: " +
                           math.add(2,3,4));

        System.out.println("Sum of 2.5 and 1.5: " +
                           math.add(2.5,1.5));
    }
}



Example #02


class Animal {

    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    }
}





Date : 25/04/2025

Day #07

Topic : Abstraction using Abstract Class, Abstraction using Interface

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2007

Video : https://www.youtube.com/watch?v=1SXyi3DK-88&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=8

Example #01


interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound(){
        System.out.println("Bark");
    }
}

class Cat implements Animal {

    public void sound(){
        System.out.println("Meow");
    }
}


public class IT24013 {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}



Example #02

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



Date : 26/04/2025

Day #08

Topic : Non-Static Inner Class, Static Nested Class

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2008

Video : https://www.youtube.com/watch?v=lsJ9QjJPbx8&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=9

Example #01

// Code 1: Non-Static Inner Class

class Outer {

    String message = "Hello from Outer Class";

    // Inner Class
    class Inner {

        void showMessage() {

            // Access outer class variable
            System.out.println(message);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Create outer class object
        Outer obj = new Outer();

        // Create inner class object
        Outer.Inner in = obj.new Inner();

        in.showMessage();
    }
}

Example #02

// Code 2: Static Nested Class

class Outer {

    static String university = "ICT Department";

    // Static nested class
    static class Inner {

        void display() {

            // Access static member
            System.out.println("University: " + university);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // No outer object needed
        Outer.Inner obj = new Outer.Inner();

        obj.display();
    }
}



Date : 27/04/2025

Day #09

Topic : ArrayList + LinkedList, HashSet + HashMap

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2009

Video : https://www.youtube.com/watch?v=TDHaeHAlPFg&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=10

Example #01

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> students = new ArrayList<>();

        students.add("Jadid");
        students.add("Rahim");
        students.add("Jadid"); // duplicate allowed

        System.out.println("ArrayList:");
        for(String name : students) {
            System.out.println(name);
        }

        System.out.println("------");

        // LinkedList
        LinkedList<String> subjects = new LinkedList<>();

        subjects.add("Java");
        subjects.add("Database");
        subjects.add("Networking");

        System.out.println("LinkedList:");
        for(String sub : subjects) {
            System.out.println(sub);
        }
    }
}


Example #02

import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // HashSet
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate ignored

        System.out.println("HashSet:");
        for(String item : fruits) {
            System.out.println(item);
        }

        System.out.println("------");

        // HashMap
        HashMap<Integer,String> student = new HashMap<>();

        student.put(101,"Jadid");
        student.put(102,"Rahim");

        System.out.println("HashMap:");
        System.out.println(student);
    }
}


Date : 28/04/2025

Day #10

Topic : ArrayList Example, LinkedList Example

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2010

Video : https://www.youtube.com/watch?v=q-5D9Z9BCVI&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=12

Example #01
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Adding elements
        students.add("Jadid");
        students.add("Rahim");
        students.add("Karim");
        students.add("Jadid"); // duplicate allowed

        // Display all elements
        System.out.println("Student List:");
        for(String name : students) {
            System.out.println(name);
        }

        System.out.println("------");

        // Access by index
        System.out.println("Element at index 1: " + students.get(1));
    }
}

Example #02
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> subjects = new LinkedList<>();

        // Add elements
        subjects.add("Java");
        subjects.add("Database");
        subjects.add("Networking");

        // Insert element
        subjects.addFirst("C Programming");

        // Remove element
        subjects.remove("Database");

        System.out.println("Subject List:");

        for(String sub : subjects) {
            System.out.println(sub);
        }
    }
}
