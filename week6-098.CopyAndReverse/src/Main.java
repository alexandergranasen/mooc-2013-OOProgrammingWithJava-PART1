import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] copy(int[] array){
        // Declares a new array called copiedArray with the length 0f 4
        int[] copiedArray = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
            copiedArray[i] = array[i];
        }
        
        return copiedArray;
    }
    
    public static int[] reverseCopy(int[] array){
        
        // Declares a new array called reverseArray with the length of 4
        int[] reversedArray = new int[array.length];

        // int i = 4-1(3), k = 0. While i is bigger or equal to 0. Decrease i with 1 and increase k with 1.
        for(int i = array.length -1, k=0; i >= 0; i--, k++){
            // prints out the array in reversed order (K = 4, 3, 2, 1) and (I = 1,2,3,4)
            reversedArray[k] = array[i];
        }
        
        return reversedArray;
    }
    
    public static void main(String[] args) {
        // write testcode here
        
        int[] original = {1,2,3,4};
        int[] reverse = reverseCopy(original);
        
        System.out.println( "\noriginal: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(reverse));       
    }
    
}
