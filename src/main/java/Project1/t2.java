package Project1;

public class t2 {
    public static void main(String[] args) {
        int[] myArray = {45, 22, 12, 43, 7};
        int sum =0;
        for (int i=0;i < myArray.length;i++) {

            sum+= myArray[i];
        }

        System.out.println("Sum of array elements " + sum);
}}
