import java.util.*;

public class StackExample {
 
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
 System.out.println();
 //popping items from the STack
 String cardAtTop = stackOfCards.pop();
 //Throws EmptyStackException if the stack is empty
 System.out.println("Stack.pop() => "+ cardAtTop);
 System.out.println(" current Stack => " + stackOfCards);
 System.out.println();
 //Get the items at the top of the stack without removing it
 cardAtTop = stackOfCards.peek();
 System.out.println("Stack.peek() => " + cardAtTop);
 System.out.println("Current Stack => "+ stackOfCards);
 }
 }
