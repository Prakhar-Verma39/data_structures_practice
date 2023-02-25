/* A sub list can be inserted into a linked list in addition to a single item. This program shows how a sub list can be inserted at different locattion in a linked list. For this purpose , the addAll() method is used . */

import java.util.*;

public class InsertSubListToLL {

public static void main(String args[]){

LinkedList<String> ll1 = new LinkedList<String>();
System.out.println("Initial List of elements : " + ll1);
ll1.add("MP allahabad");
ll1.add("MP Lucknow");
ll1.add("MP Varanasi");
System.out.println("Initial list : "+ ll1);

// Create another linked list, say ll2
LinkedList<String> ll2 = new LinkedList<String>();
ll2.add("MLA Nadia");
ll2.add("MLA Kharagpur");
ll1.addAll(ll2);
System.out.println("After addding ll2 to ll1 : " + ll1);

// Create another linked list, say ll3

LinkedList<String> ll3 = new LinkedList<String>();
ll3.add("MLA Durgapur");
ll3.add("MLA Howrah");

// Insert ll3 at a specific position of ll1

ll1.addAll(3, ll3); // Insert ll3 at location 3 of ll1
System.out.println("After inserting ll3 : " + ll1);

ll1.addFirst("President");
ll1.addLast("Prime Minister");
ll1.add("MP Chennai");
System.out.println("The final list " + ll1);
}
}

