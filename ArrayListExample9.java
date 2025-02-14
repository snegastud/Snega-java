import java.util.*;
public class ArrayListExample9{
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
//creating arraylist
ArrayList<Integer> arr1=new ArrayList<>(arr);
//copying the array list
System.out.println("copying the array list:"+arr1);

}
}