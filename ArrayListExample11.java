import java.util.*;
public class ArrayListExample11{
public static void main(String[] args){
//creating arraylist
ArrayList<Integer> arr=new ArrayList<>();
//adding the element in the arraylist
arr.add(100);
arr.add(200);
arr.add(300);
arr.add(400);
arr.add(500);
System.out.println("array elements are:"+arr);
//reverse the array element in the arraylist
System.out.println("Before array elements are:"+arr);
Collections.reverse(arr);
System.out.println("After array elements are:"+arr);


}
}