package module_2_oop.second_week_1;

import java.util.Scanner;

public class NewPhone extends Phone {

    private int quantity;

    public NewPhone() {

    }

    public NewPhone(String id, String phoneName, double price, int timeProtected, String brandCreated, int quantity) {
        super(id, phoneName, price, timeProtected, brandCreated);
        this.quantity = quantity;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of phone: ");
        quantity = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("The quantity of new phone is: " + this.quantity);
    }

    public double calPricePhone(){
        return getPrice() * getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
