package se.lexicon.model;


import javax.xml.transform.Result;
import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion

    private String id;
    private String title;
    private String author;
    public boolean avaliable;

    public Book (String title, String author){
        this.id = generateID();
        this.title = title;
        this.author = author;
        this.avaliable = true;
    }

    public Book( String title, String author, String borrower){
        this.id = generateID();
        this.title = title;
        this.author = author;
        this.avaliable = false;
    }

    public  void setId(String id){
        this.id = generateID();
    }

    public void setTitle( String title){
        this.title= title;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public void setAvaliable(boolean avaliable){
        this.avaliable = avaliable;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isAvaliable(){
        return avaliable;
    }
    public static String generateID(){
        return UUID.randomUUID().toString().substring(0,8);
    }

    public void getBookInformation(){
        StringBuilder bookInfo = new StringBuilder();
        bookInfo.append("ID: ").append(id).append(", title: ")
                .append(title).append(", author: " ).append(author)
                .append(", is avaliable? ").append(avaliable);

        System.out.println(bookInfo.toString());
    }

}