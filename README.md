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

class OuterClass {

    int outerVariable = 10;

    class InnerClass {

        void display(){
            System.out.println("Outer variable value: " + outerVariable);
        }
    }
}


public class IT24013 {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }
}




Example #02

class OuterClass {

    static int staticVariable = 20;

    static class StaticNestedClass {

        void show(){
            System.out.println("Static variable value: " + staticVariable);
        }
    }
}


public class IT24013 {

    public static void main(String[] args) {

        OuterClass.StaticNestedClass nest =
                new OuterClass.StaticNestedClass();

        nest.show();
    }
}





Date : 27/04/2025

Day #09

Topic : ArrayList + LinkedList, HashSet + HashMap

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2009

Video : https://www.youtube.com/watch?v=TDHaeHAlPFg&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=10

Example #01

import java.util.ArrayList;
import java.util.List;

public class IT24013 {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);

        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);
    }
}



Example #02

import java.util.*;

public class IT24013 {

    public static void main(String[] args) {

        // LinkedList
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        System.out.println("Animals: " + animals);

        // HashSet
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // duplicate

        System.out.println("Colors: " + colors);

        // HashMap
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println("Age Map: " + ageMap);

        int age = ageMap.get("Alice");
        System.out.println("Alice's Age: " + age);
    }
}





Date : 28/04/2025

Day #10

Topic : ArrayList Example, LinkedList Example

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2010

Video : https://www.youtube.com/watch?v=q-5D9Z9BCVI&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=12

Example #01

import java.util.ArrayList;

public class IT24013 {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Access element
        System.out.println("First fruit: " + fruits.get(0));

        // Remove element
        fruits.remove("Banana");

        // Print all elements
        System.out.println("Fruits List: " + fruits);
    }
}




Example #02


import java.util.LinkedList;

public class IT24013 {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> colors = new LinkedList<>();

        // Add elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Access element
        System.out.println("First color: " + colors.get(0));

        // Remove element
        colors.remove("Green");

        // Print all elements
        System.out.println("Colors List: " + colors);
    }
}





Date : 29/04/2025

Day #11

Topic : HashSet, TreeSet (Sorted + No Duplicate)

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2011

Video : https://www.youtube.com/watch?v=XDw-BkAZYmY&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=12


Example #01


import java.util.HashSet;

public class IT24013 {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana"); // duplicate

        // Display set
        System.out.println("Fruits in HashSet: " + fruits);

        // Check element
        if(fruits.contains("Apple")){
            System.out.println("Apple is present in the set.");
        }

        // Remove element
        fruits.remove("Cherry");

        System.out.println("After removal: " + fruits);
    }
}



Example #02


import java.util.TreeSet;

public class IT24013 {

    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3); // duplicate

        // Display sorted set
        System.out.println("Numbers in TreeSet: " + numbers);

        // Check element
        if(numbers.contains(5)){
            System.out.println("5 is present in the set.");
        }

        // Remove element
        numbers.remove(8);

        System.out.println("After removal: " + numbers);
    }
}



Date : 30/04/2025

Day #12

Topic : Simple Queue, Customer Service Queue 

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2012

Video : https://www.youtube.com/watch?v=PccU1wAdnlM&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=13


Example #01

import java.util.LinkedList;
import java.util.Queue;

public class IT24013 {

    public static void main(String[] args) {

        // Create Queue
        Queue<String> queue = new LinkedList<>();

        // Enqueue (add elements)
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // Display queue
        System.out.println("Queue: " + queue);

        // Dequeue (remove first element)
        String removedItem = queue.poll();
        System.out.println("Removed Item: " + removedItem);

        // Display after dequeue
        System.out.println("Queue after dequeue: " + queue);
    }
}



Example #02


import java.util.LinkedList;
import java.util.Queue;

public class IT24013 {

    public static void main(String[] args) {

        // Create queue
        Queue<String> customerQueue = new LinkedList<>();

        // Customers join
        customerQueue.offer("Customer 1");
        customerQueue.offer("Customer 2");
        customerQueue.offer("Customer 3");

        System.out.println("Current Queue: " + customerQueue);

        // Serve first customer
        String servedCustomer = customerQueue.poll();
        System.out.println("Serving: " + servedCustomer);

        System.out.println("Queue after serving one: " + customerQueue);

        // Serve another
        servedCustomer = customerQueue.poll();
        System.out.println("Serving: " + servedCustomer);

        // Final queue
        System.out.println("Final Queue: " + customerQueue);
    }
}



Date : 01/05/2025

Day #13

Topic : HashMap, TreeMap

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2013

Video : https://www.youtube.com/watch?v=ZarOdaT7P2k&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=14


Example #01

import java.util.HashMap;

public class IT24013 {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Access value
        System.out.println("Value for Apple: " +
                           map.get("Apple"));

        // Iterate through HashMap
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        // Check key
        if(map.containsKey("Banana")){
            System.out.println("Banana exists in map.");
        }

        // Remove element
        map.remove("Cherry");

        System.out.println("After removal: " + map);
    }
}


Example #02


import java.util.TreeMap;

public class IT24013 {

    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);

        // Access value
        System.out.println("Value for Apple: " +
                           treeMap.get("Apple"));

        // Iterate through TreeMap
        for(String key : treeMap.keySet()){
            System.out.println(key + " : " + treeMap.get(key));
        }

        // Check key
        if(treeMap.containsKey("Cherry")){
            System.out.println("Cherry exists in TreeMap.");
        }

        // Remove element
        treeMap.remove("Banana");

        System.out.println("After removal: " + treeMap);
    }
}





Date : 02/05/2025

Day #14

Topic : Library Management using ArrayList, Order Management using HashMap

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2014

Video : https://www.youtube.com/watch?v=gtmBSl10DvY&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=15


Example #01

import java.util.ArrayList;

public class IT24013 {

    private ArrayList<String> books;

    // Constructor
    public IT24013() {
        books = new ArrayList<>();
    }

    // Add book
    public void addBook(String book) {
        books.add(book);
    }

    // Display books
    public void displayBooks() {

        System.out.println("Books in the Library:");

        for(String book : books){
            System.out.println(book);
        }
    }

    public static void main(String[] args) {

        IT24013 myLibrary = new IT24013();

        myLibrary.addBook("The Great Gatsby");
        myLibrary.addBook("To Kill a Mockingbird");

        myLibrary.displayBooks();
    }
}


Example #02

import java.util.HashMap;

public class IT24013 {

    private HashMap<Integer, String> orders;

    // Constructor
    public IT24013() {
        orders = new HashMap<>();
    }

    // Add order
    public void addOrder(int orderId, String customerName) {

        orders.put(orderId, customerName);
    }

    // Display orders
    public void displayOrders() {

        System.out.println("Customer Orders:");

        for(int orderId : orders.keySet()) {

            System.out.println("Order ID: " +
                    orderId +
                    ", Customer Name: " +
                    orders.get(orderId));
        }
    }

    public static void main(String[] args) {

        IT24013 orderManagement =
                new IT24013();

        orderManagement.addOrder(101, "Alice");
        orderManagement.addOrder(102, "Bob");

        orderManagement.displayOrders();
    }
}




Date : 03/05/2025

Day #15

Topic : Write to File, Read from File

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2015

Video : https://www.youtube.com/watch?v=63c8XmiOrzo&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=16


Example #01

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("output.txt");

            BufferedWriter bufferedWriter =
                    new BufferedWriter(writer);

            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();

            bufferedWriter.write(
                    "This is a Java file handling example.");

            bufferedWriter.close();

            System.out.println(
                    "Data written to file successfully.");

        } catch (IOException e) {

            System.out.println(
                    "An error occurred: " + e.getMessage());
        }
    }
}



Example #02



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        try {

            FileReader reader =
                    new FileReader("output.txt");

            BufferedReader bufferedReader =
                    new BufferedReader(reader);

            String line;

            while((line = bufferedReader.readLine()) != null){

                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {

            System.out.println(
                    "An error occurred: " + e.getMessage());
        }
    }
}




Date : 04/05/2025

Day #16

Topic : Check File Exists, Write to File, Read from File

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2016

Video : https://www.youtube.com/watch?v=63c8XmiOrzo&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=16&t=1s


Example #01

import java.io.File;

public class IT24013 {

    public static void main(String[] args) {

        File myFile = new File("example.txt");

        // Check file exists
        if(myFile.exists()){

            System.out.println("File exists.");
        }
        else{

            System.out.println("File does not exist.");
        }
    }
}


Example #02


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        try{

            FileWriter writer =
                    new FileWriter("output.txt");

            BufferedWriter bufferedWriter =
                    new BufferedWriter(writer);

            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();

            bufferedWriter.write(
                    "This is a Java file handling example.");

            bufferedWriter.close();

            System.out.println(
                    "Data written successfully.");

        }
        catch(IOException e){

            System.out.println(
                    "An error occurred: " +
                            e.getMessage());
        }
    }
}




Example #03


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        try{

            FileReader reader =
                    new FileReader("output.txt");

            BufferedReader bufferedReader =
                    new BufferedReader(reader);

            String line;

            while((line =
                    bufferedReader.readLine()) != null){

                System.out.println(line);
            }

            bufferedReader.close();
        }

        catch(IOException e){

            System.out.println(
                    "An error occurred: " +
                            e.getMessage());
        }
    }
}




Date : 05/05/2025

Day #17

Topic : Read Bytes from File, Write Bytes to File, Copy File Using Byte Stream

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2017

Video : https://www.youtube.com/watch?v=NIxcCzJOj3c&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=17


Example #01

import java.io.FileInputStream;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;

        try {

            // Open file
            fileInputStream =
                    new FileInputStream("example.txt");

            int byteData;

            // Read bytes until end of file
            while((byteData =
                    fileInputStream.read()) != -1) {

                // Convert byte to character
                System.out.print((char) byteData);
            }

        }
        catch (IOException e) {

            e.printStackTrace();
        }

        finally {

            // Close stream
            if(fileInputStream != null) {

                try {

                    fileInputStream.close();
                }
                catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}

Example #02


import java.io.FileOutputStream;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;

        try {

            // Create output stream
            fileOutputStream =
                    new FileOutputStream("output.txt");

            String data = "Hello, World!";

            // Convert string to bytes
            byte[] byteData = data.getBytes();

            // Write bytes
            fileOutputStream.write(byteData);

            System.out.println(
                    "Data written successfully.");

        }
        catch (IOException e) {

            e.printStackTrace();
        }

        finally {

            // Close stream
            if(fileOutputStream != null) {

                try {

                    fileOutputStream.close();
                }
                catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}


Example #03

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        try {

            // Read source file
            inputFile =
                    new FileInputStream("source.txt");

            // Write destination file
            outputFile =
                    new FileOutputStream("destination.txt");

            int byteData;

            // Copy bytes
            while((byteData =
                    inputFile.read()) != -1) {

                outputFile.write(byteData);
            }

            System.out.println(
                    "File copied successfully.");

        }
        catch (IOException e) {

            e.printStackTrace();
        }

        finally {

            // Close streams
            try {

                if(inputFile != null)
                    inputFile.close();

                if(outputFile != null)
                    outputFile.close();

            }
            catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}


Date : 06/05/2025

Day #18

Topic : Check if File Exists, Write Data to File using BufferedWriter, Read Data from File using BufferedReader

Source Code : https://github.com/khalidhasan4a-ux/IT24013___30-Days-Course-Plan/tree/main/Day%2018

Video : https://www.youtube.com/watch?v=u0SsmS1wFWA&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=18


Example #01


import java.io.File;

public class IT24013 {

    public static void main(String[] args) {

        File myFile = new File("example.txt");

        if(myFile.exists()) {

            System.out.println("File exists.");
        }
        else {

            System.out.println("File does not exist.");
        }
    }
}

Example #02

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("output.txt");

            BufferedWriter bufferedWriter =
                    new BufferedWriter(writer);

            bufferedWriter.write("Hello, World!");

            bufferedWriter.newLine();

            bufferedWriter.write(
                    "This is a Java file handling example.");

            bufferedWriter.close();

            System.out.println(
                    "Data written to file successfully.");

        }
        catch(IOException e) {

            System.out.println(
                    "An error occurred: "
                    + e.getMessage());
        }
    }
}

Example #03
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        try {

            FileReader reader =
                    new FileReader("output.txt");

            BufferedReader bufferedReader =
                    new BufferedReader(reader);

            String line;

            while((line =
                    bufferedReader.readLine()) != null) {

                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch(IOException e) {

            System.out.println(
                    "An error occurred: "
                    + e.getMessage());
        }
    }
}


Date : 07/05/2025

Day #19

Topic :  

Source Code : 

Video : 


Example #01




Example #02





Date : 08/05/2025

Day #20

Topic :  

Source Code : 

Video : 


Example #01




Example #02
