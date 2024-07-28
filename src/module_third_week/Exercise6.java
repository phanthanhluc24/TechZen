package module_third_week;

import java.util.Scanner;

public class Exercise6 {
    static String name;
    static int age;
    static String province;
    static String classes;
    static String gender;
    public static void main(String[] args) {
        provideInformation();
        showInformation();

    }

    public static void provideInformation(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: ");
        age = Integer.parseInt(input.nextLine());
        System.out.println("Enter your province: ");
        province = input.nextLine();
        System.out.println("Enter your class: ");
        classes = input.nextLine();
        System.out.println("Enter your gender: ");
        gender = input.nextLine();
    }

    public static void showInformation(){
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("Your province is: "+province);
        System.out.println("Your class is: "+classes);
        System.out.println("Your gender is: "+gender);
    }
}
