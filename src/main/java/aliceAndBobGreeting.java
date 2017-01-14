/**
 * Created by matthewmartin on 1/12/17.
 */
import java.util.Scanner;

public class aliceAndBobGreeting {
    public static void main (String [] argu) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");

        String s = scan.next();

        if (s.equalsIgnoreCase( "Alice")) {
            System.out.println("Hello there Alice.");
        } else if (s.equalsIgnoreCase("Bob")) {
            System.out.println("Bob Bobolina?");
        } else {
            System.out.println("I dont know you.");
        }
    }
}