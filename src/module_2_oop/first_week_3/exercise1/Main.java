package module_2_oop.first_week_3.exercise1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(2,"",32);
        Student student1 = new Student(2,"",32);
        Student student2 = new Student(2,"",32);

        System.out.println("Number of student is: "+Student.getStudentCount());
    }
}
