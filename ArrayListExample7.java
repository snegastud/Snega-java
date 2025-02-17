import java.util.*;
public class ArrayListExample7{
public static void main(String[] args){
ArrayList<String> arr=new ArrayList<>();
//adding array elements 
arr.add("one");
arr.add("two");
arr.add("three");
arr.add("four");
arr.add("five");
//display the array elements
System.out.println("array elements are:"+arr);
//check the element are exist or not
String check="three";
if(arr.contains(check)){
System.out.println("elements are exist in the array list:"+check);
}
else{
System.out.println("elements are not in the array list:"+check);
}
}
}