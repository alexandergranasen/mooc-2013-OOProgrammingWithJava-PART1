/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandergranasen
 */
public class Player {
    private String name;
    private int goals;
    
    /**
     * Constructor that sets one variable 
     * @param name 
     */
    public Player(String name){
        this.name = name;
    }
    
    /**
     * Constructor that sets two variables
     * @param name
     * @param goals 
     */
    public Player(String name, int goals){
        this.name = name;
        this.goals = goals;
    }
    
    /**
     * 
     * @return player name
     */
    public String getName(){
        return name;
    }
    
    /**
     * 
     * @return player goals
     */
    public int goals(){
        return goals;
    }
    
    /**
     * Method that returns player name and goals made
     * @return name and goals
     */
    public String toString(){
        return ""+name + ", goals " + goals;
    }
}
