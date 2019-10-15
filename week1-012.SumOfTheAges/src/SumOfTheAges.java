
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        String nameOne;
        String nameTwo;
        int ageOne;
        int ageTwo;
        int ageTotal;

        System.out.print("Type your name: ");
        nameOne = reader.nextLine();
        
        System.out.print("Type your age: ");
        ageOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        nameTwo = reader.nextLine();
        
        System.out.print("Type your age: ");
        ageTwo = Integer.parseInt(reader.nextLine());
        
        ageTotal = ageOne + ageTwo;
        
        System.out.println(nameOne+" and "+nameTwo+" are "+ageTotal+" years old in total.");
        
    }
}
