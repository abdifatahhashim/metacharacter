package exception;

import java.util.regex.Pattern;

class meta1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\S", " ")); //false
        System.out.println(Pattern.matches("\\s", "2"));

        System.out.println(Pattern.matches("\\S", "2"));
        System.out.println(Pattern.matches("\\S", " "));
    }
}
