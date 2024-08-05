package module_2_oop.second_week_1;

import java.util.Scanner;

public abstract class Phone {
    private String id;
    private String phoneName;
    private double price;
    private int timeProtected;
    private String brandCreated;

    public Phone() {
    }

    public Phone(String id, String phoneName, double price, int timeProtected, String brandCreated) {
        this.id = id;
        this.phoneName = phoneName;
        this.price = price;
        this.timeProtected = timeProtected;
        this.brandCreated = brandCreated;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter phone series: ");
        id = input.nextLine();

        System.out.println("Enter phone name: ");
        phoneName = input.nextLine();

        System.out.println("Enter price of the phone: ");
        price = input.nextDouble();

        input.nextLine();

        System.out.println("Enter the time protected: ");
        timeProtected = Integer.parseInt(input.nextLine());

        System.out.println("The bran of the phone: ");
        brandCreated = input.nextLine();
    }

    public void output() {
        System.out.println("Id of the phone is: " + this.id);
        System.out.println("The name of phone is: " + this.phoneName);
        System.out.println("Price of the phone is: " + this.price);
        System.out.println("Day protected of the phone is: " + this.timeProtected);
        System.out.println("Branch of the phone is: " + this.brandCreated);
    }

    public abstract double calPricePhone();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTimeProtected() {
        return timeProtected;
    }

    public void setTimeProtected(int timeProtected) {
        this.timeProtected = timeProtected;
    }

    public String getBrandCreated() {
        return brandCreated;
    }

    public void setBrandCreated(String brandCreated) {
        this.brandCreated = brandCreated;
    }
}
