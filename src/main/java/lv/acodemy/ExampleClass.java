package lv.acodemy;

public class ExampleClass {
    public static void main(String[] args) {


        // Access modifier (public, private, protected, package-private)
        // Can return specific data type
        // void - if we do not return anything
        // Method name: shoould be unique, camelCase;
        // Parameters
        // return keyword if we return something

        // to create method
        // [aceess modifier] [other modifier] [return type] methodName{
        // method body
        // return [value]

        // Create method that will print out Hello, World!
        sayHello();

        greet("Elena");
        greet("Ola");
        greet("Dana");
        greet("Eva");

        System.out.println(add(30, 60 ));

        int x = add(30, 50);
        System.out.println(x);

        System.out.println(add(12.2, 13.5));

        double a = 12.12;
        double b = 13.5;
        System.out.println(add(a,b));


        String firstStudent = calculateGrade(70);
        System.out.println(firstStudent);

        String secondStudent = calculateGrade(90);
        System.out.println(secondStudent );

    }
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello," + name + "!");
    }

    //Method overloading = same name of method, but different parameters

    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >=75) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
