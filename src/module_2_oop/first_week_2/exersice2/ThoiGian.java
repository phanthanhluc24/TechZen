package module_2_oop.first_week_2.exersice2;

public class ThoiGian {
    private int hours;


    private int minute;
    private int seconds;

    public ThoiGian() {
        hours = 00;
        minute = 00;
        seconds = 00;
    }

    public ThoiGian(int hours) {
        this.hours = hours;
        minute = 00;
        seconds = 00;
    }

    public ThoiGian(int hours, int minute) {
        this.hours = hours;
        this.minute = minute;
        seconds = 00;
    }

    public ThoiGian(int hours, int minute, int seconds) {
        this.hours = hours;
        this.minute = minute;
        this.seconds = seconds;
    }

    public ThoiGian(ThoiGian other) {
        this.hours = other.hours;
        this.minute = other.minute;
        this.seconds = other.seconds;
    }

    public void xuat(){
        System.out.printf("%02d:%02d:%02d\n",hours,minute,seconds);
    }

}
