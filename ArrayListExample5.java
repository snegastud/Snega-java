import java.util.*;
public class ArrayListExample5{
public static void main(String[] args){
ArrayList<Integer> arr=new ArrayList<>();
//adding the element at arraylist
arr.add(50);
arr.add(60);
arr.add(70);
arr.add(80);
arr.add(90);
//display the element
System.out.println("Array elements are:"+arr);
//set the element
arr.set(3,100);
System.out.println("after updating the array:"+arr);
}
}