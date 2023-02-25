/* This program will initialize an array of a given size within a range between MIN and MAX. */

import java.util.*;

class ArrayInitializationRandomDemo {

static int a[] = new int[100]; //Declaring a 1D array of size 100
static int size; //Actual size of the array
static int MIN = 1 , MAX = 100; //Range of the array 
static int generateRandom(int min, int max) { // Generating a random number
int rand = (int)((Math.random() * ((max - min)) + 1) + min);
return rand;
}
public static void main(String args[]) {
Scanner in = new Scanner(System.in); //To read the size from the user
System.out.println("Enter size < 100");
size = in.nextInt(); //read a number from the keybroad
for (int i = 0; i< size; i++){
a[i] = generateRandom(MIN, MAX); //Generate and return a random number
}
System.out.println("Capacity = " + a.length + "Size : = " +size);
System.out.println(a[]); //Display the array on the screen 
}
}
