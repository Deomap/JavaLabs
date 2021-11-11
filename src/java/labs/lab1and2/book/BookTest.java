package java.labs.lab1and2.book;

import java.labs.lab1and2.book.Book;

public class BookTest {

    public static void main(String[] args) {
        Book book1 = new Book("name1", "a1", 1000, 245);
        Book book2 = new Book("name2", "a2", 2000, 231.5);
        Book book3 = new Book("name3", "a3", 3000, 200);
        System.out.println(book1.getName());
        book1.setName("name0");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
