package module_2_oop.first_week_2.exersice2;

public class Main {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.xuat();
        ThoiGian b = new ThoiGian(7);
        b.xuat();
        ThoiGian c = new ThoiGian(8,9);
        c.xuat();
        ThoiGian d = new ThoiGian(4,7,3);
        d.xuat();
        ThoiGian e = new ThoiGian(d);
        e.xuat();

    }

}
