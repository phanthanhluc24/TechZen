package module_second_week.Loop;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        int a =1;

        while (a<=number){
            System.out.println(a);
            a=a*2+1;
        }
    }
}
