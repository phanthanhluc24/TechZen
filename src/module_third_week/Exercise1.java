package module_third_week;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your character: ");
// Exercise 1
        char word = input.nextLine().charAt(0);

        System.out.println("The word after revert is: "+ toLowerCase(word));
        System.out.println("The word after revert is: "+ toLowerCase2(word));

//  Exercise 2
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        toLevel1(number1,number2);


        int minNumber = min(2,6,1,5);

        System.out.print("Gia tri nho nha la: "+minNumber);


    }
//    Way One
    public static char toLowerCase(char a){
        if (Character.isUpperCase(a)){
            a+=32;
        }
        return a;
    }

//    Way Two

    public static char toLowerCase2(char b){
        if (b>='A' && b<='Z'){
            b+=32;
        }
        return b;
    }


//    Exercise 2

    public static void toLevel1(double a, double b){
        if (a==0){
            if (b==0){
                System.out.println("Phương trình vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            double result = -b/a;

            System.out.println("Nghiệm của p2 là: "+result);
        }


    }

//    Exercise 4

    public static int min(int a, int b, int c, int d){
        int min = Math.min(a,b);
        min = Math.min(min,c);
        min = Math.min(min,d);

        return min;
    }

}

