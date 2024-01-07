package Project2;

public class Task7 {
    public static void main(String[] args) {
        String string="Reverse a String: Write,a function to reverse a given string. ";
        int wordCount=count(string);
        System.out.println("Words: "+wordCount);
    }

    public static int count(String string){

        String[] words=string.split("\\s*[,\\s!]+\\s*");
        return words.length;
    }
}
