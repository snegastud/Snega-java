import java.util.*;
public class LinkedListExample9{
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
//insert some element in the specific position
int position=0;
int element=10;
arr.add(position,element);

System.out.println("after insertion:"+arr);
}
}
