package module_third_week;

import java.util.Scanner;

public class Exercise7 {
    static String name;
    static int age;
    static String province;
    static String classes;
    static String gender;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number your employees: ");
        int employees = Integer.parseInt(input.nextLine());
        importEmployee(employees);
    }

    public static void importEmployee(int employees) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < employees; i++) {
            System.out.println("Enter name employee " + (i + 1) + " :");
            name = input.nextLine();
            System.out.println("Enter employee age " + (i + 1) + " :");
            age = Integer.parseInt(input.nextLine());
            System.out.println("Enter employee province " + (i + 1) + " :");
            province = input.nextLine();
            System.out.println("Enter employee class " + (i + 1) + " :");
            classes = input.nextLine();
            System.out.println("Enter employee gender " + (i + 1) + " :");
            gender = input.nextLine();
            showInformation();
        }
    }

    public static void showInformation() {
        System.out.println("name is: " + name);
        System.out.println("age is: " + age);
        System.out.println("province is: " + province);
        System.out.println("class is: " + classes);
        System.out.println("gender is: " + gender);
    }


}
