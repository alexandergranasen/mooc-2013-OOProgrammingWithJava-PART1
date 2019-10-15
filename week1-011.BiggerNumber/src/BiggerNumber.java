
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int numberOne = reader.nextInt();
        System.out.print("Type another number: ");
        int numberTwo = reader.nextInt();
        int biggerNumber;
        
        if(numberOne > numberTwo){
            biggerNumber = numberOne;
        } else {
            biggerNumber = numberTwo;
        }
        
        System.out.println("The bigger of the two numbers given was: " +biggerNumber);
        
    }
}
