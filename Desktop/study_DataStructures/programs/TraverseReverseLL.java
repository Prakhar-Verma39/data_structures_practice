/*The following program illuatrates how to traverse two different type of lists in reverse order, that is, from the end to the front. */

import java.util.*;
public class TraverseReverseLL {
public static void main(String args[]){
// Case 1: a linked list of countries
LinkedList<String> lCountries = new LinkedList<String>();
lCountries.add("Australia");
lCountries.add("India");
lCountries.add("South Africa");
lCountries.add("Zimbabwe");

//Traversing the list of countries in reverse order
Iterator itr1 = lCountries.descendingIterator();
while(itr1.hasNext()) {
System.out.println(itr1.next());
}

//case 2: a linked list of numbers 
LinkedList<Integer> lNumbers = new LinkedList<Integer>();
lNumbers.add(123);
lNumbers.add(345);
lNumbers.add(567);
lNumbers.add(789);

//Traversing the list of numbers in reversing order
Iterator itr2 = lNumbers.descendingIterator();
while(itr2.hasNext()) {
System.out.println(itr2.next());
}
}
}
