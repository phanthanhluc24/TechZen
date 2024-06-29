package module_second_week.Loop;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        for (int i = 2; i < 2 * number; i += 2) {
            if (i % 2 == 0) {
                System.out.println("Số chắn là: " + (i));
            }
        }
    }
}
