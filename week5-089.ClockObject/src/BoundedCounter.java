/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandergranasen
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    // Method that checks if the value is bigger then UpperLimit and then resets to 0
    public void next() {
        // write code here
        if(value +1 > upperLimit){
            value = 0;
        } else{
            value++;
        }
    }
    
    // Method thats helps us return the value
    public int getValue() {
    // write here code that returns the value
        return value;
    }
    
    // Method that lets us help set value
    public void setValue(int newValue){
        if(newValue > 0 && newValue <= upperLimit){
            value = newValue;
        }
        
    }

    // Method to print out the string value
    public String toString() {
        // write code here
        if(value < 10){
                return "0"+value;
        }
        return ""+value;
    }
}
    