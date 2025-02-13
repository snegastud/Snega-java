import java.util.*;
public class ArrayListExample3{
public static void main(String[] args){
ArrayList<Integer> arr=new ArrayList<>();
//adding the element at arraylist
arr.add(10);
arr.add(20);
arr.add(30);
arr.add(40);
arr.add(50);
arr.add(60);
//display the array elements
System.out.println("Array elements are:"+arr);
//add  the specific postion at index
arr.add(0,5);
System.out.println("Inserting an element into the array list at the first position"+arr);

}
}