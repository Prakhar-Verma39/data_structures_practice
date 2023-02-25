/*To create a queue using LinkedList class along with some common operations. Queue of integers numbers. */

import java.util.LinkedList;
import java.util.Queue;

public class QueueCreateLinkedList {

public static void main(String agrs[] ) {
// Declaration of a queue using LinkedList class
Queue<Integer> q = new LinkedList<Integer>();
// Adds elements {0,1,2,3,4} to queue
for(int i =0; i<5; i++)
q.add(i);
//Display contents of the queue
System.out.println("The queue contains : " + q);

// TO remove the head of queue
int x = q.remove();
System.out.println("The element deleted : " + x);
// To view the head of queue
int head = q.peek();
System.out.println("head of queue:"+ head);
// The size of the queue
int size = q.size();
System.out.println("Size of queue: " + size);
}
}

