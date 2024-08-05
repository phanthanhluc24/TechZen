package module_2_oop.polymorphism;

public class SinhVien extends HocVien{
    @Override
    public void a(){
        System.out.println("Toi la a con");
    }

    @Override
    public void b(){
        System.out.println("Toi la b con");
    }

    public void c(){
        System.out.println("Toi la c con");
    }

    public void d(){
        System.out.println("Toi la d con");
    }

    public byte e(){
        System.out.println("Toi la e con");
        return 1;
    }
}
