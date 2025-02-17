import java.util.*;
public class ArrayListExample8{
public static void main(String[] args){
ArrayList<String> arr=new ArrayList<>();
//adding the elements
arr.add("dog");
arr.add("cat");
arr.add("fisk");
arr.add("chicken");
//displaying the elements arrays
System.out.println("Array elements are:"+arr);
//sorting the elements 
System.out.println("before elements are sorting:"+arr);
Collections.sort(arr);
System.out.println("Array elements are sorting:"+arr);



}
}
