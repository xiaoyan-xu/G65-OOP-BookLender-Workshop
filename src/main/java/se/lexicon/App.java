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

        // Simulate borrowing a book
        // Simulate returning a book

    }

}
