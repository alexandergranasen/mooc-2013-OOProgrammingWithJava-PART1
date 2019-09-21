
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int numOne = reader.nextInt();
        System.out.println("Type another number: ");
        int numTwo = reader.nextInt();
        
        int result = numOne + numTwo;
        
        System.out.println("Sum of the numbers: "+result);
    }
}
