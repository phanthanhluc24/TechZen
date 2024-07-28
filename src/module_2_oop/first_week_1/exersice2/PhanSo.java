package module_2_oop.first_week_1.exersice2;

import java.util.Scanner;

public class PhanSo {
    int mauSo;
    int tuSo;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        tuSo = scanner.nextInt();

        do {
            System.out.println("Nhap mau so: ");
            mauSo = scanner.nextInt();
        } while (mauSo == 0);
    }


    int uocChungLonNhat() {
        if (mauSo == 0 && tuSo == 0) {
            return 1;
        }

        tuSo = Math.abs(tuSo);
        for (int i = tuSo; i >= tuSo; i--) {
            if (tuSo % i == 0 && mauSo % i == 0) {
                return i;
            }
        }

        return 1;
    }

    void ruGon() {
        int ucln = uocChungLonNhat();
        mauSo /= ucln;
        tuSo /= ucln;

        if (mauSo < 0) {
            mauSo = -mauSo;
            tuSo = -tuSo;
        }
    }

    void xuatRa(){
        ruGon();
        if (mauSo==1){
            System.out.println(tuSo);
        }else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }
}
