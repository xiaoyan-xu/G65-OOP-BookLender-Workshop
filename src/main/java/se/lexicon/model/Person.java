package se.lexicon.model;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private  String lastName;

    public Person(String firstName, String lastName){
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(int id){
        this.id = getNextId();
    }

    public void setSequencer (int sequencer){
        this.sequencer = sequencer;
    }

    public void  setFirstName (String firstName){
        this.firstName = firstName;
    }

    public  void setLastName(String lastName){
        this.lastName= lastName;
    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public static int getNextId(){
        return ++sequencer;
    }

    public void loanBook(Book book){
        if(book.isAvaliable()){
            System.out.println(firstName + lastName + " successful loan :" + book.getTitle());
            book.setAvaliable(false);
        }else {
            System.out.println("sorry this book has already borrowed");
        }
    }

    public void returnBook(Book book){
        if(!book.isAvaliable()){
            System.out.println(firstName + lastName + " you successfully return: " + book.getTitle());
            book.setAvaliable(true);
        } else{
            System.out.println("this book is already returned");
        }
    }

    public String getPersinInformation(){
      StringBuilder personInfo = new StringBuilder();

      personInfo.append("ID: ").append(id).append(", name: ")
              .append(firstName).append(lastName);

        System.out.println(personInfo.toString());

        return personInfo.toString();
    }






}