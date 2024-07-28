package module_four_week.mang_1_chieu;

import java.util.Arrays;

public class StudyArr {
    public static void main(String[] args) {
        int [] arr = {5,7,3,8,2,0};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr [j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
