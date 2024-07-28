package module_2_oop.first_week_3.exercise2;

public class MathUntil {

    private double a;
    private double b;

    public MathUntil() {
    }

    public MathUntil(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

}
