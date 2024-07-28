package module_2_oop.first_week_1.exersice1;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        name = scanner.nextLine();
        System.out.println("Enter your math score: ");
        mathScore = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter your literature score: ");
        literatureScore = Double.parseDouble(scanner.nextLine());
    }

    double calculateAverageScore(){
        return (mathScore + literatureScore) / 2;
    }

    void output(){
        System.out.println("The tall score of "+name + " is : ");
        System.out.println("Total is: "+ calculateAverageScore());
    }
}
