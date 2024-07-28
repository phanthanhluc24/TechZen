package module_four_week.mang_1_chieu;

import java.util.Arrays;

public class AddArr {
    public static void main(String[] args) {
        int[] arr = {4,7,3,56,7};

        int[] brr = new int[arr.length + 1];
        int x = 2;
        for (int i = 0; i < arr.length; i++) {
         if (i == 1) {
             brr[i+1] = 100;
         }else {
             brr[i] = arr[i];
         }
        }
        arr = brr;
        System.out.println(Arrays.toString(arr));
    }
}
