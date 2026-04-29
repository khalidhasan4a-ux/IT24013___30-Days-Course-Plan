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
