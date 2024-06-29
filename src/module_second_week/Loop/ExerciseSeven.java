package module_second_week.Loop;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        int fn = 1;
        int f1 = 0;
        int f2 = 1;

        for (; fn <= number; ) {
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }


    }

}
