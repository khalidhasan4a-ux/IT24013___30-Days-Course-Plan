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

        Person p = new Person("Rahim",20);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        p.setAge(-5);   // Invalid value

        p.setAge(22);   // Valid value

        System.out.println("Updated Age: " + p.getAge());
    }
}
