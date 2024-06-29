package module_second_week.Condition;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your month of exp: ");
        int monthOfExp = input.nextInt();

        double salary = 6500000;

        double montOfSalary;

        if (monthOfExp < 12) {
            montOfSalary = salary * 1.92;

        } else if (monthOfExp >= 12 && monthOfExp < 36) {
            montOfSalary = salary * 2.34;
        } else if (monthOfExp >= 36 && monthOfExp < 60) {
            montOfSalary = salary * 3;
        } else {
            montOfSalary = salary * 4.5;
        }
        System.out.println("Your salary is: " + montOfSalary);
    }


}
