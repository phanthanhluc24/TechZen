package module_2_oop.second_week_1;

import java.util.Scanner;

public class OldPhone extends Phone {
    private int pin;
    private String descriptions;

    public OldPhone() {
    }

    public OldPhone(String id, String phoneName, double price, int timeProtected, String brandCreated, int pin, String descriptions) {
        super(id, phoneName, price, timeProtected, brandCreated);
        this.pin = pin;
        this.descriptions = descriptions;
    }

    @Override
    public void input() {
        super.input();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pin of phone: ");
        pin = input.nextInt();

        input.nextLine();

        System.out.println("Enter the description: ");
        descriptions = input.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("The pin of phone is: " + this.pin);
        System.out.println("The description of phone is: " + this.descriptions);
    }

    public double calPricePhone(){
        return getPrice();
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

}
