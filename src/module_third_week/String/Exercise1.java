package module_third_week.String;

public class Exercise1 {
    public static void main(String[] args) {
        String word = " Hello World ";

//        a> Get hello world

        System.out.println(word.substring(7));

//        b> Replace o to f

        System.out.println(word.replace('o','f'));

//        c> count l

        int temp = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='l'){
                temp+=1;
            }
        }

        System.out.println(temp);

//        d> start and end

        System.out.println(word.indexOf('l'));
        System.out.println(word.lastIndexOf('l'));

//        e> " " to ""

        System.out.println(word.replace(" ",""));

//        f> trim " "

        System.out.println(word.trim());

//        h> Đảo ngược chuỗi

        StringBuilder newWord = new StringBuilder();
        String word1 = "Hello World";

        for (int i = word1.length() -1; i >= 0; i--) {
            newWord.append(word1.charAt(i));
        }

        System.out.println(newWord);
    }
}
