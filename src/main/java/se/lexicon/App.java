package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        Person person1 = new Person("Alex","Sabin");
        Person person2 = new Person("Jason","wang");
        System.out.println(person1.getPersinInformation());
        System.out.println(person2.getPersinInformation());

        Book book1 = new Book("live", "yuhua");
        Book book2 = new Book("one word","liu");
        Book book3 = new Book("happy live","yanny","previous borrower");

        book1.getBookInformation();
        book2.getBookInformation();
        book3.getBookInformation();


        // Simulate borrowing a book
        person1.loanBook(book1);
        person2.loanBook(book2);
        person1.loanBook(book2);
        person1.loanBook(book3);


        // Simulate returning a book
        person1.returnBook(book1);
        person2.returnBook(book2);
        person1.loanBook(book2);
        person1.returnBook(book3);
        person1.loanBook(book3);


    }

}
