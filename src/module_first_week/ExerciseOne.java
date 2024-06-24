package module_first_week;

import java.time.Year;
import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        System.out.print("Enter your year of birth: ");
        Scanner input=new Scanner(System.in);
        int yearOfBirth=input.nextInt();
        int currentYear= Year.now().getValue();
        int yourAge=currentYear-yearOfBirth;

        System.out.println("Your age is :"+ yourAge);
    }
}
