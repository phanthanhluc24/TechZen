package module_second_week.Loop;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();


        for (int i = 0; i < number; i++) {
            System.out.println(i+1);
        }
    }
}
