/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandergranasen
 */
public class StringUtils {
    public static boolean included(String word, String searched){
     
        
        if(word.equals(null) || searched.equals(null)){
            return false;
        }
        
        if(word.trim().toUpperCase().contains(searched.trim().toUpperCase())){
            return true;         
        } else {
            return false; 
        }
        
    }
}
