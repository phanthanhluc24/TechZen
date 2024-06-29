package module_second_week.Condition;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
//        Way One

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = input.nextInt();

        if (number == 1) {
            System.out.print("One");
        } else if (number == 2) {
            System.out.print("Two");
        } else if (number == 3) {
            System.out.print("Three");
        } else if (number == 4) {
            System.out.print("Four");
        } else if (number == 5) {
            System.out.print("Five");
        } else if (number == 6) {
            System.out.print("Six");
        } else if (number == 7) {
            System.out.print("Seven");
        } else if (number == 8) {
            System.out.print("Eight");
        } else if (number == 9) {
            System.out.print("Neigh");
        } else if (number == 10) {
            System.out.print("Ten");
        }


//        Way Two

        switch (number) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Neigh");
                break;
            case 10:
                System.out.print("Ten");
                break;
            default:
                System.out.print("Number invalid");
        }
    }


}
