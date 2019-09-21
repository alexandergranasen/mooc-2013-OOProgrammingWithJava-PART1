
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Declaring our variables
        int radius;
        double circumference;
        
        // Geting user input
        System.out.println("Type the radius: ");
        radius = reader.nextInt();  
        
        // Calculating circumference
        circumference = 2 * Math.PI * radius;     
        
        System.out.println("Circumference of the circle: " +circumference);
                
    }
}
