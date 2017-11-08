package practice5;

import practice2.TextIO;

import java.util.Arrays;

public class exercice2 {

    public static void main(String[] args){

        System.out.println("Enter the number");
        int x  = TextIO.getlnInt();
        System.out.println("Enter the character");
        char c  = TextIO.getlnChar();
        System.out.println(xCharacters(c, x));

    }
    public static String xCharacters(char c, int x) {

        char[] a = new char[x];
        Arrays.fill(a, c );
        String chart = new String(a);
        return chart;

    }

}
