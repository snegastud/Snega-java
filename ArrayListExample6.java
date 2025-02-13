import java.util.*;
public class ArrayListExample6{
public static void main(String[] args){
ArrayList<Integer> arr=new ArrayList<>();
//adding the array elements
arr.add(100);
arr.add(200);
arr.add(300);
arr.add(400);
arr.add(500);
//displaying the array elements
System.out.println("Before  removing Array elements are:"+arr);
//remove the element at index 
arr.remove(3);
System.out.println("after remove the element at index:"+arr);


}
}