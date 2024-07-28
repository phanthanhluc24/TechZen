package test_module_1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number ");
        int numberStar = input.nextInt();
        int star = 6;
        for (int i = 0; i < numberStar ; i++) {
            for (int j = 0; j < (numberStar - star ); j++) {
                if (i % 2 ==0){
                    System.out.print("*");
                }
            }
            System.out.println();
            star-=1;
        }

    }
}
