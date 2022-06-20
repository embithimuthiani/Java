package mypackage;

public class Clues {

    public static void clues(int a, int b){
        System.out.println("CLUE!");
        if (a < b){
            System.out.println("Pick a smaller number\n");
        } else if (a > b) {
            System.out.println("Pick a bigger number\n");
        }
    }

}
