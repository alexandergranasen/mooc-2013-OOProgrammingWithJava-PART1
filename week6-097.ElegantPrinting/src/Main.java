
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here

        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i] + ","); // Prints out 5, 1, 3, 4                 
        }
            System.out.print(array[array.length-1]); // Prints out 5 because array.length-1 == 5-1 = 4. Therefore index 4 is printed out which is the last.      
    }
}
