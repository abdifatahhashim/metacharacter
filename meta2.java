package exception;
import java.util.regex.*;


class meta2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\w","a"));
        System.out.println(Pattern.matches("\\w","2"));
        System.out.println(Pattern.matches("\\w","&"));

        System.out.println(Pattern.matches("\\W", "2"));
        System.out.println(Pattern.matches("\\W", " "));
        System.out.println(Pattern.matches("\\W", "$"));
    }
}



