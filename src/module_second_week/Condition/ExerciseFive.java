package module_second_week.Condition;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter your second number: ");
        int numberTwo = input.nextInt();
        int result;
        if (numberOne ==0){
           if (numberTwo==0){
               System.out.println("Phuong trinh vo so nghiem");
           }else {
               System.out.println("Phuong trinh vo nghiem");
           }
        }else {
            result = - numberTwo / numberOne;
            System.out.println("Nghiem cua phuong trinh la "+result);
        }
    }
}
