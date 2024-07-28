package module_2_oop.first_week_2.exersice1;

public class Constructors {


    private int tuSo;
    private int mauSo;

    public Constructors() {
        tuSo = 0;
        mauSo = 1;
    }

    public Constructors(int tuSo) {
        this.tuSo = tuSo;
        mauSo = 1;
    }


    public Constructors(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGonPhanSo();
    }


//    tim uoc chung lon nhat

    private int timUocChungLonNha(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }

        a = Math.abs(a);

        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }

    private void rutGonPhanSo() {
        int ucln = timUocChungLonNha(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    public void xuat() {
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    public Constructors copy() {
        return new Constructors(tuSo, mauSo);
    }

    public void cong(int value) {
        tuSo += value * mauSo;
        rutGonPhanSo();
    }

}
