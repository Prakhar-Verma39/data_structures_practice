//This part of the program define the structure of a binary tree
public class MinHeap<T extends Comparable<T>> {
private T[] Heap;
private int size;
private int maxsize;
private static final int FRONT = 1;
public MinHeap(T[] arr, T node)
{
this.maxsize = arr.length;
this.size = 0;
Heap = arr;
Heap[0]  = node;
}
//Method to return the position of the parent for the node currently at pos
private int parent(int pos)
{
return pos/2;
}
//Function to return the position of the right child for the node currently at pos
private int rightChild(int pos)
{
return (2*pos)+1;
}
//Method to return the position of the left child for the node currently at pos
private int leftChild(int pos)
{
return (2*pos);
}
//Function that returns true if the passed node is a leaf node
private boolean isLeaf(int pos)
{
if (pos >= (size/2) && pos <= size) {
return true;
}
return false;
}
//Function to swap two nodes of the heap
private void swap(int fpos , int spos)
{
T tmp;
tmp = Heap[fpos];
Heap[fpos] = Heap[spos];
Heap[spos] = tmp;
}
//Function to print the contents of the heap 
public void print()
{
for(int i = 1; i <= size / 2 ; i++)
{
System.out.print(" PARENT : "+ Heap[i]
+ " LEFT CHILD : " + Heap[2*i] 
+ " RIGHT CHILD : " + Heap[2*i + 1]);
System.out.println();
}
}
//Function to heapify the node at pos
private void minHeapify(int pos)
{
//Tf the node is a non-leaf node and greater than any of its child
if(!isLeaf(pos)) {
if(Heap[pos].compareTo(Heap[leftChild(pos)]) > 0 || Heap[pos].compareTo(Heap[rightChild(pos)]) > 0 ) {
//swap with the left child and heapify the left child
if(Heap[leftChild(pos)].compareTo(Heap[rightChild(pos)]) < 0) {
swap(pos,leftChild(pos));
minHeapify(leftChild(pos));
}
//Swap with the right child and heapify the right child
else {
swap(pos, rightChild(pos));
minHeapify(rightChild(pos));
}
}}
}
//Function to insert a node into the heap
public void insert(T element)
{
if(size >= maxsize)
{
return;
}
Heap[++size] = element;
int current = size;
while (Heap[current].compareTo(Heap[parent(current)]) < 0 ) {
swap(current, parent(current));
current = parent(current);
}
}
//Function to remove and return the minimum element from the heap
public T remove()
{
T popped = Heap[FRONT];
Heap[FRONT] = Heap[size--];
minHeapify(FRONT);
return popped;
}
//Function to build the min heap using the minHeapify
public void minHeap()
{
for(int pos = (size/2); pos >= 1; pos--) {
minHeapify(pos);
}
}
public static void main(String[] arg)
{
System.out.println("The Min Heap is ");
Integer[] a = new Integer[15];
MinHeap minHeap = new MinHeap(a , 5);
//minHeap.insert(5);
minHeap.insert(3);
minHeap.insert(17);
minHeap.insert(10);
minHeap.insert(84);
minHeap.insert(19);
minHeap.insert(6);
minHeap.insert(22);
minHeap.insert(9);
minHeap.minHeap();
minHeap.print();
System.out.println("The Min val is " + minHeap.remove());
}
}
