package module_second_week.Loop;

import java.util.Scanner;

public class ExerciseFourTeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your row: ");
        int row = input.nextInt();
//        System.out.print("Enter your column: ");
//        int column = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i==1 || i==row || j==1 || j==row){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


    }
}
