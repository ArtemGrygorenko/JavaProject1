package Project2;

import java.util.HashMap;

public class Task9 {
    public static void main(String[] args) {
        String string="adohbhguwidjbvoiwelah";
        char result=find(string);
        System.out.println("First non-repeating character: " + result);


    }
    public static char find(String string) {
        HashMap<Character, Integer> chareee = new HashMap<>();

        for (char ch : string.toCharArray()) {
            chareee.put(ch, chareee.getOrDefault(ch, 0) + 1);
        }
        for (char ch : string.toCharArray()) {
            if (chareee.get(ch) == 1) {


                return ch;
            }
        }


        return 0;
    }}
