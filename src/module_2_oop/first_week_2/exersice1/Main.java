package module_2_oop.first_week_2.exersice1;

public class Main {
    public static void main(String[] args) {
        Constructors a = new Constructors();
        a.xuat();
        Constructors b = new Constructors(1,2);
        b.xuat();
        Constructors c = new Constructors(3);
        c.xuat();
        Constructors d = new Constructors(-6,-2);
        d.xuat();
        Constructors e = new Constructors(3,-1);
        e.xuat();
        Constructors f = e.copy();
        f.cong(100);
        e.xuat();
        f.xuat();

    }
}
