package module_third_week.string_builder;

public class Exercise1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello World");
        System.out.println(stringBuilder.substring(6));

        StringBuffer stringBuffer = new StringBuffer("Hello World");
        System.out.println(stringBuffer.substring(6));

        System.out.println(stringBuilder.replace(4,5,"f"));
        System.out.println(stringBuffer.replace(4,5,"f"));


        String input = "Hello";
        StringBuilder stringBuilder1 = new StringBuilder(input);
        System.out.println(stringBuilder1.append(" World"));
        System.out.println(input.concat(" World"));

        StringBuffer stringBuffer1 = new StringBuffer(input);
        System.out.println(stringBuffer1.append(" World"));
        System.out.println(input + " World");

    }
}
