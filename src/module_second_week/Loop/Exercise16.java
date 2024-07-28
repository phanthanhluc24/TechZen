package module_second_week.Loop;

public class Exercise16 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        String name = "12021";

        if (name.charAt(0)==name.charAt(-1)){
            System.out.println("Doi xung");
        }
    }
}

