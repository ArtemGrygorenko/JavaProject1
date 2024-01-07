package Project2;

public class Task1 {
    public static void main(String[] args) {
        String s1="Artem";
        String s2="Grygorenko";
        System.out.println(s1);
        System.out.println(s1);
        System.out.println(" *******swap******");


        s1=s1+s1;
        s1=s1.substring(0,s1.length()-s1.length());
        s1=s1.substring(s1.length());
        System.out.println(s1);
        System.out.println(s1);
    }
}
