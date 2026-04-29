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
