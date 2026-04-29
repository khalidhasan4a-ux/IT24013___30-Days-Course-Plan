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
