package test_module_1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many number do you want to cal: ");
        int number = input.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Please enter your " + (i + 1) + " number: ");
            int element = input.nextInt();
            arr[i] = element;
        }

        int sumPositiveNumber = 0;
        int sumNegativeNumber = 0;
        int totalSum;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 ==0){
                sumPositiveNumber+=arr[j];
            }else {
                sumNegativeNumber+= arr[j];
            }
        }

        totalSum = sumPositiveNumber - sumNegativeNumber;

        System.out.println("The resul is: "+ totalSum);
    }
}
