import java.util.Scanner;
import mypackage.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is a mini game.\nGuess the right number\nWe will give you clues!!\n");
        Scanner scan = new Scanner(System.in);
        int random = RandomNumber.randomNumber();
        int i = 0;
        while (i<1) {
            System.out.print("Enter a random guess between 0 - 100\nNumber: ");
            byte number = scan.nextByte();
            if (number > 100){
                System.out.println("Try again later");
                break;
            }
            i = Check.check(random,number);
            Clues.clues(random,number);
        }
        System.out.println("\nThanks for playing!!!");
    }
}