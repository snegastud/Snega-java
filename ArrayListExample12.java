import java.util.*;
public class ArrayListExample12{
public static void main(String[] args){
//creating arraylist
ArrayList<Integer> arr=new ArrayList<>();
//adding the element in the arraylist
arr.add(100);
arr.add(200);
arr.add(300);
arr.add(400);
arr.add(500);
//display the array  list
System.out.println("array elements are:"+arr);
//extract a postion of an arraylist
System.out.println("Before array elements are extract postion:"+arr);
arr.get(2);
System.out.println("After array elements are extract the postion:"+arr.get(2));


}
}