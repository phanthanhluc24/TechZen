package module_second_week.Condition;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Use temp
        System.out.print("Enter your first number: ");
        int numberA = input.nextInt();
        System.out.print("Enter your second number: ");
        int numberB = input.nextInt();

        int temp;

        temp=numberA;
        numberA=numberB;
        numberB=temp;

        System.out.println("Number A is "+ numberA);
        System.out.println("Number B is "+ numberB);

//  Not use temp

        numberA=numberA + numberB;
        numberB=numberA-numberB;
        numberA=numberA-numberB;

        System.out.println("Number A is "+ numberA);
        System.out.println("Number B is "+ numberB);
    }
}
