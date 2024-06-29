package module_second_week.Loop;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        int distance = 1;
        int count = 0;

        for (int i = 2; i < 2*number; i+=2) {
            if (count == distance){
                System.out.println(-i);
                count = 0;
                distance ++;
            }else {
                System.out.println(i);
                count ++;
            }

        }


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i==1 || i==6){
                    System.out.print("*");
                }else {
                    if (i==2 || i==3 || i==4 || i==5){
                        System.out.print("*");
                    }
                }

            }
            System.out.println();
        }
    }
}
