package practice5;

import practice2.TextIO;

public class exercice4 {

    public static void main(String[] args){
        System.out.println("Enter the min number");
        int min = TextIO.getlnInt();
        System.out.println("Enter the max number");
        int max = TextIO.getlnInt();
        String question = "Enter any number";
        System.out.println(getNumber(question, min, max));

    }
    public static int getNumber(String question,int min, int max){
        System.out.println(question);
        int n = TextIO.getlnInt();
        while (n < min || n > max) {
            System.out.println("Enter another number");
            n = TextIO.getlnInt();
        }
        return n;



    }

}
