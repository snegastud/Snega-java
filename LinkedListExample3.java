import java.util.*;
public class LinkedListExample3{
public static void main(String[] args){
LinkedList<Integer> arr=new LinkedList<>();
//add the elements
arr.add(10);
arr.add(20);
arr.add(30);
arr.add(40);
arr.add(50);
//display the array elements
System.out.println("array elements are:"+arr);
//iterator starting at the specific position
int startposition=2;
ListIterator<Integer> start=arr.listIterator(startposition); 
//iterator through the array element
while(start.hasNext()){
System.out.println("interator the linkedlist array:"+start.next());
}
}
}