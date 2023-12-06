package org.example;

public class T9 {
    public static void main(String[] args) {
        int[] numbers = {253, 234, 345, 13643, 43552, 532357};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int num = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = num;
                }
            }
        }
        System.out.println("Second Largest Number " + numbers[numbers.length - 2]);
    }
}