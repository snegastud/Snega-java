import java.util.*;
public class ArrayListExample14{
public static void main(String[] args){
ArrayList<Integer> arr=new ArrayList<>();
arr.add(10);
arr.add(20);
arr.add(30);
arr.add(40);
arr.add(50);
//display the array elements
System.out.println("array elements are:"+arr);
//swap the array elements 
System.out.println("Before array elements swaping:"+arr);
Collections.swap(arr,0,1);
System.out.println("After array elements swaping:"+arr);
}
}