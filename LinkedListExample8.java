import java.util.*;
public class LinkedListExample8{
public static void main(String[] args){
LinkedList<Integer> arr=new LinkedList<>();
//add the elements
arr.add(50);
arr.add(60);
arr.add(70);
arr.add(80);
arr.add(90);
//display the array elements
System.out.println("array elements are:"+arr);
//add the element at the end
arr.add(100);
System.out.println("after the append the end of the linked list:"+arr);
}
}