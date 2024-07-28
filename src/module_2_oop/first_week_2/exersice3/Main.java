package module_2_oop.first_week_2.exersice3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Phan Thanh Luc", 9.9);

        System.out.println("ID " + student.getId());
        System.out.println("Name " + student.getName());
        System.out.println("Score " + student.getScore());

        student.setName("Luc Phan Thanh");
        student.setScore(0.3);

        System.out.println("Name " + student.getName());
        System.out.println("Score " + student.getScore());

        student.setName(" ");
        student.setScore(10.1);
    }
}
