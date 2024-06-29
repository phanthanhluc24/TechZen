package module_second_week.Loop;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 2 !=0){
                System.out.println("Số lẻ : "+i);
            }
        }

        for (int i = 1; i < number; i+=2) {
            System.out.println("Số lẻ : "+(i));
        }
    }
}
