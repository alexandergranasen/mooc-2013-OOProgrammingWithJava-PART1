
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandergranasen
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    /**
     * 
     * @param density 
     */
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Method that prints out stars randomly on one row
     */
    public void printLine(){
        Random random = new Random();
        
        for(int i = 0; i < this.width; i++){
            double randomNumber = random.nextDouble(); // Gives us a random number between 0 and 1
            if(randomNumber < density){
                 System.out.print("*");
                 this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }  
        }
        System.out.println(" ");
    }
    
    public void print(){
        for(int i = 0; i < this.height; i++){
            printLine();
        }
    }
    
    /**
     * Method that takes the counted stars and adds them to a new variable.
     * We also reset our counter variable.
     * @return numberOfStars
     */
    public int starsInLastPrint() {
        int numberOfStars = this.starsInLastPrint;
        this.starsInLastPrint = 0;
        return numberOfStars;
    }
    
}
        
        
/*
Add to the class NightSky the method printLine, that prints one line of starts. 
        The line length is determined by the value of the instance variable width and the instance variable density determines the star probability. 
        For each printed character you should use a Random object to decide if it prints out as a white space or a star. 
        The method nextDouble will probably be of use now.

    public void printLine() {
        Random random = new Random();
        
        for (int i = 0; i < this.width; i++) {
            double probabilityTest = random.nextDouble();
            if (probabilityTest < density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }  
*/  