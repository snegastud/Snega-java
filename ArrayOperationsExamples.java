import java.util.*;
public class ArrayOperationsExamples{
public static void main(String[] args){
ArrayList<String> arr=new ArrayList<>();
arr.add("apple");
arr.add("orange");
arr.add("banana");
arr.add("mango");
arr.add("water melon");
System.out.println("adding array elements list:"+arr);
//remove the array elements at index postions
arr.remove(2);
System.out.println("after removing the array list:"+arr);
//sort the array elements
Collections.sort(arr);
System.out.println("after sorting the array elements:"+arr);
//shuffle the array elements in the array
Collections.shuffle(arr);
System.out.println("after suffle the array elements:"+arr);
//reverse the array elements 
Collections.reverse(arr);
System.out.println("after reverse the array elements:"+arr);
//set the first element
arr.set(0,"grapes");
System.out.println("after set the first elements in the array:"+arr);
//set the last element in the array 
arr.set(arr.size()-1,"giwi");
System.out.println("after set the last elements in the array"+arr);
//arraylist covert into array
String[] array = new String[arr.size()];
arr.toArray(array);
System.out.println("ArrayList converted to Array: " + Arrays.toString(array));
}
}