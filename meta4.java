package exception;

import java.util.regex.Pattern;

class meta4 {
    public static void main(String[] args)
    {
        // \d-number
        // \D-Non Digit
        // \s-Any White Space
        // \S-Non White Space character
        // \w-any word character like  numbers/characters
        // \W-special symbols
        System.out.println(Pattern.matches(
                "\\d\\D\\s\\S\\w\\W", "1G FG!")); // true

        System.out.println(Pattern.matches(
                "\\d\\D\\s\\S\\w\\W", "Geeks!")); // false
    }
}


