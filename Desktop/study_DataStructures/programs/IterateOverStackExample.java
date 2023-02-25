/* Iterate using : forEach \ iterator() \ forEachRemaining() \ ListIterator() */

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class IterateOverStackExample {

public static void main(String at[]) {

Stack<String>stackOfPlates = new Stack<>();
stackOfPlates.add("Plate 1");
stackOfPlates.add("Plate 2");
stackOfPlates.add("Plate 3");
stackOfPlates.add("Plate 4");
System.out.println("=== Iterate over Stack using forEach() method ===");
stackOfPlates.forEach(plate -> {
System.out.println(plate);
});
System.out.println("\n=== Iterate over a Stack using iterator() ===");
Iterator<String>platesIterator = stackOfPlates.iterator();
while (platesIterator.hasNext()) {
String plate = platesIterator.next();
System.out.println(plate);
}
System.out.println("\n=== Iterate over a Stack from TOP to BOTTOM using listIterator() ===");
// ListIterator allows you to traverse in both forward and backword directions.
// We'll start from the top of the strack and traverse backwards.

ListIterator<String>platesListIterator = stackOfPlates.listIterator (stackOfPlates.size());
while(platesListIterator.hasPrevious()) {
String plate = platesListIterator.previous();
System.out.println(plate);
}
}
}

