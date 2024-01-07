package Project1;

public class T4 {
    public static void main(String[] args) {
        int[][] num = {
                {23, 34, 32,234},
                {45, 40, 33,343},
                {78, 24, 634,534}
        };
        int sumEven = 0;
        int sumOdd = 0;
        for (int i=0; i < num.length;i++) {
            for (int j=0; j < num[i].length;j++) {
                if (num[i][j]%2 == 0) {
                    sumEven += num[i][j];
                } else {
                    sumOdd += num[i][j];
                }
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}

