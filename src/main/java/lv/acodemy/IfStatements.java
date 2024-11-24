package lv.acodemy;

public class IfStatements {
    public static void main(String[] args) {

        // Even or Odd
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        }

        // Check if a number is positive or negative (Assume 0 is positive)

        number = -10;
        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("the number is negative.");
        }

        // Grade checker (if-else-if)
        // 90 = A
        // 75 -> 89 = B
        // 50 -> 74 = C
        // <50 = F

        // 1) create score fariable:
        // 2) Create logic (if score >= 90) =A
        // else - if (score >= 75) -> B
        // else - if (score >= 50) -> C
        // else -> F

        int score = 87;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >=75) {
            System.out.println("Grade B");
        } else if (score >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        // Task #1: Check if a person is eligible to buy an alcohol; (If)

        int age = 15;
        if (age >= 18) {
            System.out.println("You win!");
        } else {
            System.out.printf("Ask mom!");
        }

        // Task #2: Check if a number can be divided by 5;

        number = 10;
        if (number % 5 == 0) {
            System.out.println("The number can be divided by 5 w/o remainder.");
        } else {
            System.out.printf("No");
        }

        // Task #3: Check pass of fail
        // if score >= 50 (passed)
        // all other cases (faoled)

        int score1 = 30;
        if (score1 >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // Tempetarure message if -else-if
        // Abouve 30 (it's hot)
        // 15 - 30 (Nice weather)
        // below 15 (Its cold)

        int temperature = 25;
        if (temperature > 30) {
            System.out.println("It's hot!");
        } else if (temperature >=15) {
            System.out.println("Nice weather!");
        } else {
            System.out.println("Its cold");
        }

        // Traffic light system (if-else-if)
        // Green -> Go
        // Yellow - Slow down
        // Red - stop
        // string color
        // if (color.equals("Green")){}

        String color = "Green";
        if (color.equals("Green")) {
            System.out.println("Go!");
        } else if (color.equals("Yellow")) {
            System.out.println("Slow down!");
        } else if (color.equals("Red")) {
            System.out.println("Stop!");
        } else {
            System.out.println("Unknown color");}
    }
}