package ss8_stack_queue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cách 1
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(10);
//        integers.add("20");

        //

        // Cách 2
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
//        arrayList.add("abc");

        int sum = 0;
        // Tính tổng
        for(Integer value : arrayList) {
            sum += value;
        }

        System.out.println("Tổng: " + sum);

    }
}
