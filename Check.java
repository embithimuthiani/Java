package mypackage;

public class Check {

    public static int check(int a, int b){
        if (a == b){
            System.out.println("Correct! You win!!!");
            return 1;
        }else{
            System.out.println("\nWrong continue trying\n");
        }
        return 0;
    }

}
