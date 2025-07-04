package se.lexicon.model;


import javax.xml.transform.Result;

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
        this.title = title;
        this.author = author;
        this.avaliable = true;
    }

    public Book( String title, String author, String borrower){
        this.title = title;
        this.author = author;
        this.avaliable = false;
    }

    public  void setId(String id){
        this.id = id;
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

    public void getBookInformation(){
        StringBuilder bookInfo = new StringBuilder();
        bookInfo.append("ID: ").append(id).append(", title: ")
                .append(title).append(", author: " ).append(author)
                .append(", is avaliable? ").append(avaliable);

        System.out.println(bookInfo.toString());
    }

}