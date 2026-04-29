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

        Person p = new Person("Khalid",00);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        p.setName("Jadid");
        p.setAge(23);

        System.out.println("Updated Name: " + p.getName());
        System.out.println("Updated Age: " + p.getAge());
    }
}
