/* This program shows how to create an array of objects of type Student and then add the array into a linked list and then printing the same . */

import java.util.*;

// Declaration of a user defined class

class Student {

String name;
double marks;

// Constructor 

Student(String s , double m){

name = s;
marks = m; 

}
void printData() {

// To print a record

System.out.println("Name : " + name);
System.out.println("Marks : " + marks);

}
}

public class CreateLLofCollection {

public static void main(String args[]){

Student sArray[] = new Student[5]; // To store 5 objects
//Create the array sArray

sArray[0] = new Student("Ram" , 79.6);
sArray[1] = new Student("Rahim" , 85.5);
sArray[2] = new Student("John" , 90.1);
sArray[3] = new Student("Lisa" , 69.4);
sArray[4] = new Student("Ana" , 59.8);

// Creating a linked list with sArray collection

LinkedList<Student> ll = new LinkedList<Student>(Arrays.asList(sArray));

Student temp;

//Printing the list using an iterator

Iterator<Student> itr = ll.iterator();

while(itr.hasNext()) {
temp = itr.next();
temp.printData(); // Print the current record
}
}
}

