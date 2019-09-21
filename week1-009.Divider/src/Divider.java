
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: " );
        int numOne = reader.nextInt();
        System.out.print("Type another number: ");
        int numTwo = reader.nextInt();
        
        double result = (double)numOne/numTwo;
        
        System.out.println("Division: "+numOne+"/"+numTwo+" = "+result);
    }
}
