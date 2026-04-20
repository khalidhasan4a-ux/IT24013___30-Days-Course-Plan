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
