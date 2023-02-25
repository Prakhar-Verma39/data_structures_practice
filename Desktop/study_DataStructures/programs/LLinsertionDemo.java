/*This program shows how items can be inserted at different locations in a linked list . For this purpose, there are methods like add() , addFirst() , addLast() are defined in the LinkedList class. */

import java.util.*;

public class LLinsertionDemo {

public static void main(String args[] )
{
// Creating an empty ll of class LinkedList

LinkedList <String> ll = new LinkedList<String>();
// Adding elements to the linked list using a number of add methods

ll.add("Mumbai"); // Add an initial item 
ll.add("Chennai"); // Add another item
ll.addLast("Kolkata"); // Add at the end
ll.addFirst("Delhi");  // Add at the front
ll.add(2, "Bangalore"); // Add in the Specific location
ll.add("Guwahati"); // Sequential add goes at the end
ll.add("Hyderabad");  // Another sequential insertion

// Printing the list using an iterator

Iterator<String> itr = ll.iterator();

while(itr.hasNext()) {
System.out.println(itr.next());
}
// Alternatively
System.out.println("Linked list : " + ll); //simple printing
}
}
