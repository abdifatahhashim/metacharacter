package exception;

import java.util.regex.Pattern;

public class meta3 {
    public static void main(String[] args) {
        // \b says that a string must have boundary letters
        // of word characters
        System.out.println( Pattern.matches("\\bmeta\\b", "meta"));
        System.out.println( Pattern.matches("\\bmeta\\b", "@meta"));
        // \B says that a string must have non word
        // characters as boundaries
        System.out.println( Pattern.matches("\\B@meta@\\B", "@meta@"));
        System.out.println( Pattern.matches("\\Bmeta\\B", "meta"));
    }
}
