package lv.acodemy;

import java.io.FilterOutputStream;

public class Practice {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + i * 5);
        }
    }

}
