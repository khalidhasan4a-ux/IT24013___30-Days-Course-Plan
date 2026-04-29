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
