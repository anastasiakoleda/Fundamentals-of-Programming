package practice4;

import practice2.TextIO;

public class exercise5 {
    public static void main(String[] args){
        System.out.println("Enter the number of rows");
        int row = TextIO.getlnInt();

        for (int i = 0; i<= (row+2)*2; i++){
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i <= row; i++ ){
            System.out.print("| ");
            for (int j = 0; j <= row; j++){
                if (i+j == row)
                    System.out.print("X" + " ");
                else
                    if (i == j)
                        System.out.print("X" + " ");
                    else
                        System.out.print(0 + " ");


            }
            System.out.println("|");
        }

        for (int i = 0; i<= (row+2)*2; i++){
            System.out.print("-");
        }
    }

}
