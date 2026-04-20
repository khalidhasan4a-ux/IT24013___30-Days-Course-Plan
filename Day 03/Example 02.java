class Student {

    private String name;     // private
    private int age;         // private

    public String school;    // public
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
        System.out.println("School: " + school);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        // Using setters
        s1.setName("Jadid");
        s1.setAge(20);

        // Direct access (allowed ones)
        s1.school = "ABC College";
        s1.city = "Dhaka";
        s1.country = "Bangladesh";

        s1.display();
    }
}
