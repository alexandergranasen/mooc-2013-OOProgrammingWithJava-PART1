/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandergranasen
 */
public class Person {
    private String fullName;
    private String telephoneNumber;
    
    public Person(String fullName, String telephoneNumber){
        this.fullName = fullName;
        this.telephoneNumber = telephoneNumber;
    }
    
    public String getName(){
        return fullName;
    }
    
    public String getNumber(){
        return telephoneNumber;
    }
    
    public void changeNumber(String number){
        this.telephoneNumber = number;
    }
    
    public String toString(){
        return getName() + " " + " number: " +getNumber();
    }
}
