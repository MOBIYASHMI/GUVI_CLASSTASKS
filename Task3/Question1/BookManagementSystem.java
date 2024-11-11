package GUVI_CLASSTASKS.Task3.Question1;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library=new Library();

        // add a book to library
        Book book=new Book(24,"Othello","Shakespeare",true);
        library.addBooks(book,3);
        book=new Book(25,"Chandalika","RabindraNath",true);
        library.addBooks(book,4);

        // remove a book from library
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter book name to remove : ");
        String bookname= obj.next();
        library.removeBooks(bookname);
        System.out.println();

        // search for availability of a book
        System.out.println("Enter book id to check whether it is available or not : ");
        int bookID=obj.nextInt();
        library.searchBooks(bookID);
        System.out.println();

        // Method to display all books in library
        library.display();
    }
}
