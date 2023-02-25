/*The LinkedList class is loaded with several other like get(), contain(), size(), set(), etc. The following program illustrates those methods and their utilities in Java programming. */

import java.util.*;
public class OthermethodsOfLL {

public static void main(String args[]) { //Creating a linked list
LinkedList<String> lLetters = new LinkedList<String>();
lLetters.add("J");
lLetters.add("O");
lLetters.add("Y");
lLetters.add("W");
lLetters.add("I");
lLetters.add("T");
lLetters.add("H");
lLetters.add("J");
lLetters.add("A");
lLetters.add("V");
lLetters.add("A");
lLetters.add("2020");
System.out.println("List : "+lLetters);
// Finding an elements in the linked list
boolean status = lLetters.contains("Z");
if(status)
System.out.println("List contains the elment 'Z' ");
else
System.out.println("List doesn't contain 'Z'");

// Finding the number of elements in the linked list
int size = lLetters.size();
System.out.println("Number of letters = " + size);
// Get and set elements from the linked list
String element = lLetters.get(11);
System.out.println("Element returened by get() : "+ element);
lLetters.set(11, "The fun");
System.out.println("Linked list after change : " + lLetters);
}
}

