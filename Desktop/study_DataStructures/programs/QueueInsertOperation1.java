/* To create queue  structure with ArrayBlocking class (same as PriorityQueue class) and insert elements and queue structure grows automatically. */

import java.util.concurrent.*;
public class QueueInsertOperation1 {
public static void main(String args[]) {
BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
System.out.println(queue.add(1));
System.out.println(queue.add(2)); //Maximum capacity
System.out.println(queue);  //Queue grows dynamically
System.out.println(queue.add(3)); 
System.out.println(queue);
for(int i = 9 ; i>0; i--)
queue.add(i);
System.out.println(queue);
}}
