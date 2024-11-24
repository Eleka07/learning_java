package lv.acodemy;

public class Home {
    public static void main(String[] args) {

        // exercise #1
        int j = 1;
        int sum = 0;
        while (j<=20) {
            sum = sum +j; j=j+1;
        }
        System.out.println(sum);

        // exercise #2
        int number = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }


        // exercise #3
        int m = 10;
        while (m>0) {
            System.out.println(m);
            --m;
        }


        // exercise #4
        for (int i = 1; i <= 5; i++) {

            // Inner loop
            for (int w = 1; w <= i; w++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }


        // exercise #5
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*i);
        }

        // exercise #6
        int f = 1;
        int result = 0;
        while (f<=10) {
            result = result + f; f++;
            System.out.println(result);
        }

        // exercise #7
        String[] dogs = {"Pincher", "Dog", "Terrier", "Hound", "Spaniel"};
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }


        // exercise #8
        for (int i = 100; i >= 0; i-=5) {
            System.out.println(i);
        }
    }
}
