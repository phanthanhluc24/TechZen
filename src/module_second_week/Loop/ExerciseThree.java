package module_second_week.Loop;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int number = input.nextInt();

        for (int i = 2; i < number ; i+=2) {
            if (i % 4 ==0){
                System.out.println("Số chia hết cho 4 là: "+ (-i));
            }else {
                System.out.println("Số không chia hết cho 4 là: "+ (i));
            }

        }
    }
}
