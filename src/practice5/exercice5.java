package practice5;

import practice2.TextIO;

import java.util.Random;

public class exercice5 {

    public static void main(String[] args){
        System.out.println("Enter the min number");
        int min = TextIO.getlnInt();
        System.out.println("Enter the max number");
        int max = TextIO.getlnInt();
        System.out.println(random(min, max));

    }
    public static int random(int min, int max){
        Random r = new Random();
        int c = r.nextInt(max)+min;
        return c;



    }

}
