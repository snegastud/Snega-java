import java.util.*;
public class LinkedListExample2{
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
//iterator through the array element
Iterator<Integer> it=arr.iterator();
while(it.hasNext()){
System.out.println("interator the linkedlist array:"+it.next());
}
}
}