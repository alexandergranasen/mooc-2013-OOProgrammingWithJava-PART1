
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
public class Library {
    /*
    ArrayList to hold all the books
    */
    private ArrayList<Book> library = new ArrayList<Book>();
    
    /*
    Default constructor
    */
    public Library(){}
    
    /*
    Method to add books
    */
    public void addBook(Book newBook){
        this.library.add(newBook);
    }
    
    /*
    Method to print out all the books in the library
    */
    public void printBooks(){
        for(Book book : library){
            System.out.println(book);
        }
    }
    
    /*
    Method to search the library for books by title
    */
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
                
        for(Book book : library){
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
            }
            return found;
        }
    
    /*
    Method to search the library for books by publisher
    */
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : library){
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }    
    
    /*
    Method to search for books by year
    */
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book book : library){
            if(book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
}


  