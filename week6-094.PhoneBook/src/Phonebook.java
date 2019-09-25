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
public class Phonebook {
    private ArrayList<Person> personList = new ArrayList<Person>();
    
    // creates a Person-object and adds it to the ArrayList inside the Phonebook
    public void add(String name, String number){
        this.personList.add(new Person(name, number));
    }
            
            
    // prints all the persons inside the Phonebook
    public void printAll(){
        for(Person person : personList){
            System.out.println(person.getName() +" "+ person.getNumber());
        }
    }
    
    // returns the phone number corresponding to the given name. If the sought person is not known the string "number not known" is returned.
    public String searchNumber(String name){
        for(Person person : personList){
            if(name.equals(person.getName())){
                return person.getNumber();
                }                
        }
        return "number not known";
    }
}


