import java.util.*;
public class ArrayListExample16{
public static void main(String[] args){
ArrayList<Object> arr=new ArrayList<Object>();
arr.add("snega");
arr.add(2207);
arr.add(10.2);
arr.add("nanthinipriya");
//display the array list
System.out.println("array elements are:"+arr);
//clone the array
@SuppressWarnings("unchecked")
ArrayList<Object> arr1=(ArrayList<Object>)arr.clone();
//display the array list
System.out.println(" clone array elements are:"+arr1);


}
}