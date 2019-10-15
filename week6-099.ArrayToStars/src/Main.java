
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        
        /**
         * First loops trough the array, then loops trough each row.
         * Prints out:
         * *****
         * *
         * ***
         * ****
         * **
         */
        for(int number : array){
            for(int i = 0; i < number; i++){
                System.out.print("*");
            }
            System.out.println();
        }
      
        }
    }
