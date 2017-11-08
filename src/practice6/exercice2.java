package practice6;

import practice2.TextIO;

import java.util.Arrays;
import java.util.Random;

public class exercice2 {
    public static void main(String[] args){
        reversegetNumber();

    }


    static void reversegetNumber(){
        int[] number = new int[3];
        for (int index = 0; index < number.length; index++){
            System.out.println("Pls enter the number");
            number[index] = TextIO.getlnInt();
        }
        System.out.println(Arrays.toString(number));
    }
}
