package practice2;

public class product {
    public static void main(String[] args){
        System.out.println("Insert a number ");
        int number1 = TextIO.getlnInt();
        System.out.println("Insert a second number ");
        int number2 = TextIO.getInt();

        System.out.println("The product of this numbers is: "+ (number1*number2) );

    }
}
