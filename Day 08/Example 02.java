class OuterClass {

    static int staticVariable = 20;

    static class StaticNestedClass {

        void show(){
            System.out.println("Static variable value: " + staticVariable);
        }
    }
}


public class IT24013 {

    public static void main(String[] args) {

        OuterClass.StaticNestedClass nest =
                new OuterClass.StaticNestedClass();

        nest.show();
    }
}
