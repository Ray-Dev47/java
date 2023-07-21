/*
 Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
*/

import java.util.ArrayList;

public class Book {
     private String title;
     private String author;
     private String ISBN;
     private static ArrayList <Book> bookCollection = new ArrayList<Book>();
     

     public Book(String author, String title, String ISBN){
          this.author = author;
          this.title = title;
          this.ISBN = ISBN;
     }

     public String getTitle(){
          return title;
     }

     public void setTitle(String title){
          this.title = title;
     }


     public String getAuthor(){
          return author;
     }

     public void setAuthor(String author){
          this.author = author;
     }

     public String getISBN(){
          return ISBN;
     }

     public void setISBN(String ISBN){
          this.ISBN = ISBN;
     }

     public static void add_Book(Book book){
          bookCollection.add(book);
     }

     public static void remove_Book(Book book){
          bookCollection.remove(book);
     }

     public static ArrayList <Book> get_bookCollection(){
          return bookCollection;
     }


  public static void main(String[] args) {
        Book book1 = new Book("Chinua Achebe", "Things fall apart" , "2345TYJK");
        Book book2 = new Book("Charles Dickens", "Oliver Twist", "78UUIE");

        Book.add_Book(book1);
        ArrayList < Book > bookCollection = Book.get_bookCollection();
        System.out.println("List of books:");
//     for (Book book: bookCollection) {
//       System.out.println(book.setTitle() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
//     }
    Book.remove_Book(book1);
    System.out.println("\nAfter removing " + book1.getTitle() + ":");
    System.out.println("List of books:");
    for (Book book: bookCollection) {
      System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
    }
  }
}
