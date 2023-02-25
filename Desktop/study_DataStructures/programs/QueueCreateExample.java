/* To create a queue using PriorityQueue class along with some common operations. Queue of string objects. */
 import java.util.*;

public class QueueCreateExample {

public static void main(String args[]) {

Queue<String> queue = new PriorityQueue<>();
queue.add("one");   // Adding some elements into the queue
queue.add("two");
queue.add("three");
queue.add("four");
System.out.println(queue);  //Display the contents in queue
queue.remove("three");
System.out.println(queue);
System.out.println("Queue Size: " + queue.size());
System.out.println("Queue contains element \"two\" or not? : " + queue.contains("two")); //To empty the queue
queue.clear();
}
}
