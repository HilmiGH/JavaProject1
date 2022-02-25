import java.util.Scanner;

public class ProcessAName5026211152 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your full name (Just 2 Word) : ");
        String name = input.nextLine();
        int spaceDivider = name.indexOf(" ");
        String firstName = name.substring(0, 1) + ".";
        String lastName = name.substring(spaceDivider + 1);
        String finalName = lastName + ", " + firstName;
        System.out.print("Your name is : " + finalName);



        /*
        System.out.print("Please enter your first name : ");
        String firstName = input.next();
        System.out.print("Please enter your last name : ");
        String lastName = input.next();
         */


    }
}
