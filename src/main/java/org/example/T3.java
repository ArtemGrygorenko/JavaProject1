package org.example;

public class T3 {
    public static void main(String[] args) {

        int[][] myArray = {
                {11, 232, 12,122},
                {64, 645, 61,333},
                {23, 23, 34,234}
        };

        for (int i=0; i < myArray.length; i++) {
            for (int j=0; j < myArray[i].length; j++) {
                if (myArray[i][j]%2 == 0) {
                    System.out.println(myArray[i][j] );
                }
            }
        }}
}

