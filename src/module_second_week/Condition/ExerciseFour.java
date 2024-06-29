package module_second_week.Condition;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter your second number: ");
        int numberTwo = input.nextInt();

        if (numberTwo > numberOne) {
            System.out.println("Max number is " + numberTwo);
            System.out.println("Min number is " + numberOne);
        } else {
            System.out.println("Max number is " + numberOne);
            System.out.println("Min number is " + numberTwo);
        }

        int max = (numberOne > numberTwo) ? numberOne : numberTwo;
        int min = (numberOne > numberTwo) ? numberTwo : numberOne;

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }
}
