package module_first_week;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNumber=input.nextInt();

        System.out.print("Enter your second number: ");
        int secondNumber=input.nextInt();

        System.out.println("----- Choose your calculation ---");
        System.out.println("----1. Calculation is +");
        System.out.println("----2. Calculation is -");
        System.out.println("----3. Calculation is *");
        System.out.println("----4. Calculation is /");
        System.out.println("----------------------------------");

        System.out.print("Enter your number: ");
        int calculation=input.nextInt();

       int result= Calculation(calculation,firstNumber,secondNumber);
        System.out.print("The result of calculation is: "+result);
    }

    public static int Calculation( int calculation,int firstNumber, int secondNumber){
        int result;
        switch (calculation){
            case 1:
                result=firstNumber+secondNumber;
                break;
            case 2:
                result= firstNumber-secondNumber;
                break;
            case 3:
                result=firstNumber*secondNumber;
                break;
            case 4:
                result=firstNumber/secondNumber;
                break;
            default:
                return 0;

        }
        return result;
    }
}
