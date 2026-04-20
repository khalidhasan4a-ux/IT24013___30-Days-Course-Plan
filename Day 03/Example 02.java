class Student {

    private String name;     // private
    private int age;         // private

    public String university;    // public
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
        System.out.println("University: " + university);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        // Using setters
        s1.setName("Khalid");
        s1.setAge(23);

        // Direct access (allowed ones)
        s1.university = "MBSTU";
        s1.city = "Tangail";
        s1.country = "Bangladesh";

        s1.display();
    }
}
