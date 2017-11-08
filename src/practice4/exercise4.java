package practice4;

import practice2.TextIO;

public class exercise4 {
    public static void main(String[] args){
        System.out.println("Enter the number of rows");
        int row = TextIO.getlnInt();
        for (int i = 0; i <= row; i++ ){
            for (int j = 0; j <= row; j++){
                if (i == j)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");


            }
            System.out.println();
        }
        }
    }

