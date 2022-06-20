package mypackage;

public class RandomNumber {
    
    public static byte randomNumber(){
        byte number = (byte)(Math.random() * 100);
        return number;
    }
    
}
