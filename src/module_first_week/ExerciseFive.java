package module_first_week;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double bankinh=input.nextDouble();

        double chuViHinhTron=2 *Math.PI* bankinh;

        double dienTichHinhTron=Math.PI * (bankinh * 2);

        System.out.println("Dien tich hinh tron la: "+dienTichHinhTron);
        System.out.println("Chu vi hinh tron la: "+chuViHinhTron);
    }
}
