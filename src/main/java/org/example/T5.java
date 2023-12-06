package org.example;

public class T5 {
    public static void main(String[] args) {
        int a = 234;
        int b = 6346;
        System.out.println("Before a="+ a + ",b= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After  a="+ a + ",b= " + b);
    }
}