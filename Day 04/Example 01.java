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
