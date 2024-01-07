package Project2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String string1="night";
        String string2="thing";
if (anagrame(string1,string2)){
    System.out.println(string1+" and "+string2+" =Anagrams");
}else {
    System.out.println(string1+" and "+string2+" =not a Anagrams");

}
    }

    private static boolean anagrame(String string1,String string2){
        String s1=string1.replaceAll("[^a-zA-Z]","").toLowerCase();
        String s2=string2.replaceAll("[^a-zA-Z]","").toLowerCase();
        return Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());


    }
}
