package practice2;

public class Groups {
    public static void main(String[] args){
        System.out.println("Insert a number of people: ");
        int people = TextIO.getlnInt();
        System.out.println("Insert a number of groups");
        int groups = TextIO.getlnInt();
        System.out.println("The number of full groups: " +  (people/groups));
        System.out.println("The number of people who left over: " +  (people%groups));
    }
}
