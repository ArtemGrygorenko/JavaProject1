package Project1;

import java.util.Arrays;

public class T8 {
    public static void main(String[] args) {
        int[] numbers = {3145, 456, 238, 151, 612, 533, 6437, 46};
        Arrays.sort(numbers);
        System.out.println("Maximum num " + numbers[numbers.length - 1]);
        System.out.println("Minimum num " + numbers[0]);
    }
}


