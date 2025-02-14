import java.util.*;
public class ArrayListExample10{
public static void main(String[] args){
ArrayList<String> arr=new ArrayList<>();
arr.add("carrot");
arr.add("tomato");
arr.add("cucumber");
arr.add("broccoli");
//display the element in the array
System.out.println("array elements are:"+arr);
//shuffle the array elements
Collections.shuffle(arr);
System.out.println("shuffle in the elements:"+arr);
}
}