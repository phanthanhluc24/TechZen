package module_second_week.Loop;

import java.util.Scanner;

public class ExerciseFiveTeen {
    public static void main(String[] args) {
//        A
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <=number ; j++) {
                if (i==1 || i==number || j==1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
//        B
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <=number ; j++) {
                if (i==1 || i==number || j==number){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
