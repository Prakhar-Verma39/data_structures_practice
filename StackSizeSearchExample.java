import java.util.*;

public class StackSizeSearchExample {
 
 public static void main(String af[])
 {
 //Creating a stack
 Stack<String>stackOfCards = new Stack<String>();
 // Pushing new items to the Stack
 stackOfCards.push("Jack");
 stackOfCards.push("Queen");
 stackOfCards.push("King");
 stackOfCards.push("Ace");
 System.out.println("Stack => " + stackOfCards);
 // check if the stack is empty 
 System.out.println("Is Stack empty? : " + stackOfCards.isEmpty());
 //Find the size of Stack
 System.out.println("Size of Stack : " + stackOfCards.size());
 //Search for an element
 // the Serach () method returns the 
 // l-based position of the element from the top of the stack
 // It returns -1 if the element was not found in the stack
 int position = stackOfCards.search("Ace");
 if(position != -1) {
 System.out.println("Found element \"Ace\" at position : "+ position);
 } else {
 System.out.println(" Element not found ");
 }
 }
 }

