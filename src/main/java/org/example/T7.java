package org.example;

public class T7 {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;
        System.out.println("First " + n + " numbers in the Fibonacci series");
        for (int i = 0; i < n; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.println(first + " ");
        }
    }
}

