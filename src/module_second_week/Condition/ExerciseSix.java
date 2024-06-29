package module_second_week.Condition;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter your second number: ");
        int numberTwo = input.nextInt();
        System.out.print("Enter your third number: ");
        int numberThree = input.nextInt();

        if (numberOne==0){
           if (numberTwo==0){
               System.out.println("Phuong trinh vo so nghiem");
           }else {
               System.out.println("Phuong trinh vo nghiem");
           }
        } else {
            int delta;
            delta = (numberTwo*2) - 4*numberOne*numberThree;
            if (delta<0){
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta==0) {
                int x = -numberTwo / 2*numberOne;
                System.out.println("Nghiem cua phuong trinh la: "+ x);
            }else {
                double x = (-numberTwo - Math.sqrt(delta)) / (2*numberOne);
                double y = (-numberTwo + Math.sqrt(delta)) / (2*numberOne);
                System.out.println("Nghiem cua phuong trinh la: "+ x);
                System.out.println("Nghiem cua phuong trinh la: "+ y);
            }

        }
    }
}
