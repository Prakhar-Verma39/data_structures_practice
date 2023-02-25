/*This program shows how an existing array can be reversed its ordering : A genetic programming using recursion is illustrated. */

class Generic1DArray <T> {
private T x; // x is a collection of generic type T 
//constructor
public Generic1DArray( T t) {

x=t;
}
//A recursive method to reverse the ordering of array x
public void reverse1D(int length) {
if(length > 1 ) { // termination condtion check
// Swap the end elements
T temp;
temp = x[size - length];
x[size - length] = x[length - 1];
x[length -1] = temp;
reverse1D(length - 1); //Do recursively for the next level
}
}// This completes the definition of the generic class GenericClass<T>

public static void main(String args[]) {
// Case 1 : Working with integer array 
Generic1DArray<Integer> intA = new Generic1DArray<Integer> (1,2,3,4,5,6);
intA.reverse1DArray(6);
System.out.println(intA);

Generic1DArray<String> stringA = new Generic1DArray<String>("A", "E", "I", "O","U");
stringA.reverse1DArray(5);
System.out.println(stringA);
}
}

