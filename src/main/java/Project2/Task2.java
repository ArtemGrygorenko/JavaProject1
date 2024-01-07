package Project2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String alfa1 = "Find 123 out124 h*o*w many546 alpha!! characters are p!r!e!s!e!n!t in a string?";
        int alphabet = countA(alfa1);
        System.out.println(alfa1);
        System.out.println("Alphabet count= " + alphabet);

    }

    private static int countA(String str) {

        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}

