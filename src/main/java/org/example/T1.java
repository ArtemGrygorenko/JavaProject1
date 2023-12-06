package org.example;

public class T1 {
    public static void main(String[] args) {
        int [] temp={35,45,66,43,76,56,86,};

            int TempH = temp[0];
            int TempL = temp[0];

            for(int i=0; i<temp.length; i++){

                if(TempH < temp[i]){
                    TempH = temp[i];
                } else if(temp[i] < TempL){
                    TempL = temp[i];
                }
            }
            System.out.println("Highest Temperature is " + TempH+" F");
            System.out.println("Lowest Temperature is " + TempL+ " F");
        }
    }
