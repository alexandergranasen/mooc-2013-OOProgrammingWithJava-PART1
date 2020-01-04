import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        doSomething(scanner);

    }
    
    public static void doSomething(Scanner scanner) {
        int input = 0;
        Grade grade = new Grade();
        /**
         * Runs while scanner is not empty.
         */
        while(input != -1){
            

            System.out.println("Type the points [0-60]: ");
            input = scanner.nextInt();
            
            grade.calculateGrade(input);
            
        }
            System.out.println("Grade distribution:");
            System.out.println("5:   " +grade.getFive());
            System.out.println("4:   " +grade.getFour());
            System.out.println("3:   " +grade.getThree());
            System.out.println("2:   " +grade.getTwo());
            System.out.println("1:   " +grade.getOne());
            System.out.println("0:   " +grade.getZero());
            System.out.println("Acceptance percentage: " +grade.getTotal());

        }
    
    }

