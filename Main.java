import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //try {
            System.out.print("Hi! ");

            int score = input.nextInt();  // may cause InputMismatchException

            System.out.println("Your score is: " + score);
        //}
       // catch (Exception e) {
           // System.out.println("Invalid input! Please enter a number.");
        //}

        System.out.println("Program finished.");
        input.close();
    }
}

