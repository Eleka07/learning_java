package lv.acodemy;

public class Loops {
    public static void main(String[] args) {

        String [] shoppinglist = {"Bread", "Milk", "Eggs", "Fruits"};
        for (int i = 0; i < shoppinglist.length; i++) {
            System.out.println("Current product is" + shoppinglist[i]);
        }
        System.out.println("Goes next!");

        for (String s : shoppinglist) {
            System.out.println("Current product is" + s);
        }
        System.out.println("Goes next!");


        int i = 0;
        while (i < shoppinglist.length) {
            System.out.println("Current product is" + shoppinglist[i]);
            i++;
        }

        int j = 0;
        do {
            System.out.println("Current product is" + shoppinglist[j]);
            j++;
        } while (j < shoppinglist.length);

        boolean x = 1 < 5 && 6 > 3; //AND
        boolean y = 2 < 5 || 3 < 2; //OR
        System.out.println(x);
        System.out.println(y);
    }
}
