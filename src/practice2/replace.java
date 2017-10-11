package practice2;

public class replace {
    public static void main(String[] args) {
        System.out.println("Insert a phrase ");
        String phrase = TextIO.getlnString();
        System.out.println(phrase.replace('a','_'));
    }
}
