/* The following program shows a list containing a number of books, insertion of another books in the  list, deletion of books and then traversing of the books, etc. */

import java.util.*;

// Defining a calls Book
class Book {
int accnNo ; 
String title, author, publisher;
double cost;
// Constructor of the class
Book(int id, String t, String auth, String pub, double val) {
accnNo = id;
title = t;
author = auth;
publisher = pub;
cost = val;
}
}
// The main class maintaining a library of books
public class LibraryLL {
public static void main(String args[]) {
LinkedList<Book> library = new LinkedList<Book> ();  //Creating list of Books
//Creating a list of Books
Book b1 = new Book(101,"Oracle Java", "Leslie Lamport", "Oxford" , 88.5);
Book b2 = new Book(102,"Complete Java", "McGraw Hill" , "TMH" , 94);
Book b3 = new Book(103, "Joy with Java","Samanta","Prentice Hall", 69.6);
library.add(b1);
library.add(b2);
library.add(b3);

//Traversing the List
for(Book b : library ) {
System.out.println("Book ID: "+b.accnNo);
System.out.println(b.title+" "+b.author+" "+b.publisher+" "+b.cost);
System.out.println();
}
}
}

