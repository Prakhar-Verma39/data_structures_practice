//This program shows how a queue can be defined using array
class QueueA<T>
{
T[] data;
int front, rear;
int length;
QueueA(T[] a){
data = a;
front =0 ;
rear = -1;
length = a.length;
}
/* The methods enqueue(), dequeue(), isEmpty(), printQueue()
are to be defined here. */

//This part of the program includes the definition of the enqueue() method

//Defining the insert operation

void enqueue(T a){
if(rear >= length - 1){
System.out.println("Queue Overflow");
}
else {
 rear++;
 data[rear] = a;
 }
 }

//This part of the program includes the definition of dequeue() method

//Defining the delete operation
T dequeue() {
T x = null;
if(isEmpty()) {
System.out.println("Queue Underflow");
return null;
}
else {
x = data[front];
front++;
return x;
}
}

//This part of the program includes the definition of isEmpty() method

boolean isEmpty() {
if(front > rear) { 
return true;
}
else { 
return false;
}
}

//This part of the program includes the definition printQueue() method
//Defining an operation to print an entire queue content

void printQueue() {
if(!isEmpty()) {
for(int i= front; i <=rear; i++){
System.out.print(data[i] + " ");
}
}
System.out.println();
}
}

class QueueAImplementationDemo {
public static void main(String ar[]) {
Integer arr[] = new Integer[2];
QueueA<Integer> q = new QueueA<Integer>(arr);

q.enqueue(1);
q.printQueue();
q.enqueue(2);
q.printQueue();
q.enqueue(2);
q.printQueue();
q.dequeue();
q.printQueue();
q.dequeue();
q.printQueue();
q.dequeue();
q.printQueue();
}
}// End of the demo class

