package module_first_week;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number moto: ");
        int numberMoto=input.nextInt();
        int totalLength=String.valueOf(numberMoto).length();
        int sum = 0;
        for (int i = 0; i < totalLength; i++) {
            sum = ( sum + (i+1) );
        }
        System.out.print("Total number moto is: " + sum % 10);
    }
}