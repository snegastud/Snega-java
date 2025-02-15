import java.util.*;
public class ArrayListExample15{
public static void main(String[] args){
ArrayList<Integer> arr=new ArrayList<>();
arr.add(100);
arr.add(80);
arr.add(90);
arr.add(70);
arr.add(60);
//display the array elements
System.out.println("array elements are:"+arr);
//join two array list
ArrayList<Integer> arr1=new ArrayList<>();
arr1.add(70);
arr1.add(60);
arr1.addAll(arr);
System.out.println("joined the array list:"+arr1);

}
}