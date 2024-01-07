package Project2;

public class Task12_test {
    public static void main(String[] args) {
        // Test student A
        A studentA = new A(82, 43, 95);
        System.out.println("Percentage for student A: " + studentA.getPercentage() + "%");

        // Test student B
        B studentB = new B(91, 79, 84, 92);
        System.out.println("Percentage for student B: " + studentB.getPercentage() + "%");
    }
}
