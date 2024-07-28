package module_four_week.mang_1_chieu;

import java.util.Scanner;

public class SaveInforStudent {
    public static void main(String[] args) {
        int[] age = new int[5];
        String[] province = new String[5];
        String[] name = new String[5];
        String[] classes = new String[5];

        addStudent(age, province, name, classes);
        showStudent(age, province, name, classes);
    }

    public static void addStudent(int[] age, String[] province, String[] name, String[] classes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many student do you want to save: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Age " + (i + 1) + " student: ");
            age[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Province " + (i + 1) + " student: ");
            province[i] = scanner.nextLine();
            System.out.println("Name " + (i + 1) + " student: ");
            name[i] = scanner.nextLine();
            System.out.println("Classes " + (i + 1) + " student: ");
            classes[i] = scanner.nextLine();
        }
    }

    public static void showStudent(int[] age, String[] province, String[] name, String[] classes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which student need to show: ");
        int number = scanner.nextInt();
        System.out.println(age[number]);
        System.out.println(province[number]);
        System.out.println(name[number]);
        System.out.println(classes[number]);
    }
}