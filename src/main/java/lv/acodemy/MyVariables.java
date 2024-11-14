package lv.acodemy;

public class MyVariables {
    public static void main(String[] args) {
        //This is my comment
        /*
        This is 1st line
        This is 2nd line
        This is 3rd line
        */
        //int (integer) - whole number / natural number
        int age = 47;
        int currentYear = 2024;
        // currentYear = camelCase
        // snake_case - dont!!!
        // current-year = kebab case dont!!!
        int inventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        // double (fractional number)
        double temperature = 36.6;
        double price = 19.99;

        System.out.println(temperature);
        System.out.println(price);

        // char (symbol)

        char grade = 'A';
        char myInitial = 'N';
        char currency = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currency);

        // boolean (logical type, can keep only two values: true or false)
        // How to name? has or is
        // Example: isSummer / if(isSummer) {};
        // Example: hasAccess / if(hasAccess) {};

        boolean hasAccess = true;
        System.out.println(hasAccess);

        boolean isSummer = false;
        System.out.println(isSummer);

        // long
        long phoneNumber = 234567;

        // float
        float interestRate = 4.5f;

        // Arithmetic operators

        int a = 10;
        int b = 5;
        int sum = a + b; //add
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference);

        int k = 10;
        int l = 3;
        int division = k / l;
        System.out.println(division);

        int n = 7;
        int m = 5;
        int result = n * m;
        System.out.println(result);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.println(divResult);

        // % (reminder of a division)
        int f = 10;
        int q = 3;
        int reminder = f % q; // 10 = 3 * 3 +1
        System.out.println(reminder);

        int number = 9;
        boolean isEven = (number % 2 == 0);
        System.out.println(isEven);

        number ++;
        System.out.println(number);
        number --;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++; // postIncrement = 11; counter = 12;
        int preIncrement = ++counter; // preIncrement = 13; counter = 13;
        System.out.println(postIncrement);
        System.out.println(preIncrement);
    }
}
