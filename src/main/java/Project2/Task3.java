package Project2;

public class Task3 {
    public static void main(String[] args) {
        String string1 = "Artem Grygorenko";
        String revers = revers(string1);
        System.out.println(string1);
        System.out.println("Reversed= " + revers);

    }
    private static String revers(String string) {
        StringBuilder revers = new StringBuilder(string);
        revers.reverse();
        return revers.toString();
    }
}
