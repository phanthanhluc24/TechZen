package test_module_1;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 10,10, 9};
        int[] arr1 = {10, 10, 10};
        int[] arr2 = {5, 3, 6, 7};

      int result =  findHeightNumber(arr);
        System.out.println("Ket qua la: "+result);

    }

    public static int findHeightNumber(int [] arr){
        int temp;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] > arr[j] && arr[i] != arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[arr.length-2];
    }
}
