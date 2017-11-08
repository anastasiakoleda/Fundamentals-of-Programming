package practice6;

import practice2.TextIO;

import java.util.Arrays;
import java.util.Random;

public class exercice1 {
    public static void main(String[] args) {
        getNamber();

    }

    static void getNamber(){
        String[] names = new String[10];
        for (int index = 0; index < names.length; index++){
            System.out.println("Pls enter the name");
            names[index] = TextIO.getlnString();
        }
        System.out.println(Arrays.toString(names));
        System.out.println(names[new Random().nextInt(names.length)]);
     }
}
