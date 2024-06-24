package module_first_week;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter the name of product: ");
        String productName=input.nextLine();
        System.out.print("Enter the price of product: ");
        Double price=input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity=input.nextInt();
        buyProduct(productName,price,quantity);
    }

    public static void buyProduct(String productName,Double price, int quantity){
        System.out.println("Product name is: "+productName);
        System.out.println("The total price is: "+ price * quantity);
        System.out.println("The fee VAT"+ (price * quantity) * 0.1);
    }
}
