package practice6;

import practice2.TextIO;

import java.util.ArrayList;

public class exercice4 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            System.out.println("Pls enter the names, press enter to exit");
            String name = TextIO.getlnString();

            if (name.length() > 0)
                names.add(name);
            else
                break;
        }

        for (String name:names) {
            System.out.print(co(name, 'a') + " ");
            System.out.println(name);
        }

    }

    public static int co(String str, char letter){
        int counter = 0;
        str = str.toUpperCase();
        char letterUpper = Character.toUpperCase(letter);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letterUpper)
                counter++;
        }
        return counter;
    }

}
