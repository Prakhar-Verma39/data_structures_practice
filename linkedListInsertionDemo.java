import java.io.*;
import java.util.*;
// Java program to implement a Singly Linked List

class JLinkedList<T> {

Node head; //head of list

class Node {
T data;
Node next;
 
 //constructor
 Node(){
 data = null;
 next = null;
 }
 Node(T d){
 data = d;
 next = null;
 }
 }
 JLinkedList() {
 head = new Node();
 }
 
 //Method to maintain the collection to be defined


 //Defining the method to Insert at the front
 public void insertFront(T data) {
 //Create a new node woth given data
 Node newNode = new Node(data);
 newNode.next = this.head.next;
 // Make the new node as the first node
 this.head.next = newNode;
 }
 
 //Defining the method to Insert at the end
 public void insertEnd( T data ){
 Node newNode = new Node(data);
 newNode.next = null;
 Node temp = this.head;
 
 while(temp.next != null)
 {
 temp = temp.next;
 }
 temp.next = newNode;
 }
 
 //Defining the method to insert at any position 
 public void insertKey( T data , T key ){
 Node newNode = new Node(data);
 newNode.next = null;
 Node temp = this.head;
 boolean status = false;
 while(temp != null)
 {
 if(temp.data == key) {
 status = true;
 break;
 }
 temp = temp.next;
 }
 if(status){
 newNode.next = temp.next ; 
 temp.next = newNode;
 }
 }

//Definig the method to print the list
 public void printList(){
 Node currNode = this.head.next;
 System.out.print("LinkedList : ");
 //Traverse through the LinkedList
 while(currNode != null) {
 //Print the data at current node 
 System.out.print(currNode.data + " ");
 //go to next node
 currNode = currNode.next;
 }
 System.out.println();
 }
 
 //Defining the method to merge two lists into a single list
 public void merge(JLinkedList<T> l2) {
 Node l1Node = this.head;
 Node l2Node = l2.head;
 while(l1Node.next != null){
 l1Node = l1Node.next;
 }
 l1Node.next = l2Node.next;
 //free(l2.head); //Return the node to free memory
 }
 
 //Defining the method to delete a node at the front of list
 public T deleteFront(){
 T x = null;
 Node temp = this.head.next ;
 if(temp != null){
 x = temp.data;
 this.head.next = temp.next; //changed head
 //Display the message 
 System.out.println("Element deleted");
 }
 return x; //Return the deleted data
 }
 
 //Defining the method to delete a node from the end 
 public void deleteEnd() {
 T x = null;
 Node temp = this.head.next , prev = null;
 if(temp != null) { //if the list is not empty
 while(temp.next != null){ //Move to the end node
 prev = temp;
 temp = temp.next;
 }
 //x = temp.data;
 System.out.println("element deleted");
 prev.next = null;
 }
 //return x;
 }
 
 //Defining the method to delete a node from any position
 public void deleteKey(T key){
 Node temp = this.head.next , prev = null;
 while(temp != null){
 if(temp.data == key) {
 prev.next = temp.next;
 //Display the message
 System.out.println(key + "position element deleted");
 break;
 }
 else {
 prev = temp;
 temp = temp.next;
 }
 }
 }
 
 //Defining the method to reverse the ordering of nodes
 public Node remove(Node n){
 Node current = n;
 Node next = n.next;
 Node prev = null;
 
 while(current!=null){
 next = current.next;
 current.next = prev;
 prev = current ; 
 current = next;
 }
 this.head.next = prev;
 return next;
 }
 
 public void reverse(){
 Node currNode = this.head.next;
 System.out.println("Reversed List : ");
 remove(currNode);
 }
 }
 class linkedListInsertionDemo {
 public static void main(String args[]) {
 /*JLinkedList<Integer> list = new JLinkedList<Integer>();
 list.insertEnd(9);
 list.printList();
 list.insertFront(5);
 list.printList();
 list.insertEnd(10);
 list.printList();
 list.insertKey(7,5);
 list.printList();
 list.insertKey(12,0);
 list.printList();
 list.insertKey(13,10);
 list.printList();
 list.insertFront(2);
 list.printList();*/
 
 /*JLinkedList<Integer> list1 = new JLinkedList<Integer>();
 JLinkedList<Integer> list2 = new JLinkedList<Integer>();
 list1.insertFront(1);
 list1.insertFront(2);
 list1.insertEnd(3);
 list1.insertEnd(4);
 list1.printList();
 
 list2.insertFront(5);
 list2.insertEnd(6);
 list2.printList();
 
 //Merge the list after list2 and return the result as list 1
 list1.merge(list2);
 System.out.println("Merged List : ");
 list1.printList();*/
 
 JLinkedList<Integer> list = new JLinkedList<Integer>();
 list.insertFront(1);
 list.insertFront(2);
 list.insertFront(3);
 list.insertFront(4);
 list.insertFront(5);
 list.insertFront(6);
 list.insertFront(7);
 list.insertFront(8);
 //Print the LinkedList
 list.printList();
 
 list.deleteKey(3);
 list.printList();
 
 list.deleteFront();
 list.printList();
 
 list.deleteEnd();
 list.printList();
 
 /*JLinkedList<Integer> list = new JLinkedList<Integer>();
 
 list.insertEnd(9);
 list.printList();
 list.insertFront(5);
 list.printList();
 list.insertEnd(10);
 list.printList();
 list.insertKey(7,5);
 list.printList();
 list.insertKey(12,0);
 list.printList();
 list.insertKey(13,10);
 list.printList();
 list.insertFront(2);
 list.printList();
 
 list.reverse();
 list.printList();*/
 }
}
