package Project2;

public class Task4 {
    public static void main(String[] args) {
        String string="Deified";
        if (palindrome(string)){
            System.out.println(string+" is a palindrome");
        }else {
            System.out.println(string+" is not a palindrome");
        }
    }
    private static boolean palindrome(String string){
        String revers1=new StringBuilder(string).reverse().toString();
        return string.equalsIgnoreCase(revers1);
    }
}

