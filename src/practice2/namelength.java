package practice2;

public class namelength {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = TextIO.getlnString();
        int nameLength = name.length();
        System.out.println("The length of your name is: " + nameLength);
    }
}
