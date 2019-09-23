import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandergranasen
 */
public class Team {
    private ArrayList<Player> players = new ArrayList<Player>();
    private String name;
    private int maxSize = 16;
    
    // Constructor that sets the name
    public Team(String name){
        this.name = name;
    }
    
    // Returns the name
    public String getName(){
        return name;
    }
    
    // Adds a player to the ArrayList, but first checks if the team is full
    public void addPlayer(Player player){
        if(players.size() < maxSize){
            players.add(player);
        } 
    }
    
    // Returns the number of goals by the team
    public int goals(){
        int totalGoals = 0;
        for(Player player : players){
            totalGoals += player.goals();
        }
        return totalGoals;
    }
    
    // Sets the maximum amount of players
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    // Returns the team size
    public int size(){
        return players.size();
    }
    
    // Prints the players in the team
    public void printPlayers(){
        for(Player player : players){
            System.out.println(player);
        }
    }
}
