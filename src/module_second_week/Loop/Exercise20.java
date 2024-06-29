package module_second_week.Loop;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your price of items: ");
        int price = Integer.parseInt(input.nextLine());

        System.out.print("Enter your cost of items: ");
        int cost = Integer.parseInt(input.nextLine());

        int backMoney = cost - price;

        for (int i = 0; i < backMoney; i++) {
            backMoney = backMoney % 500000;
            System.out.println(backMoney);
        }


    }
}
