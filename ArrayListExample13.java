import java.util.*;
public class ArrayListExample13{
public static void main(String[] args){
ArrayList<String> arr=new ArrayList<>();
arr.add("carrot");
arr.add("tomato");
arr.add("cucumber");

//display the array list
System.out.println("array elements are:"+arr);
ArrayList<String> arr1=new ArrayList<>();
arr1.add("carrot");
arr1.add("tomato");
arr1.add("cucumber");
//display the array list
System.out.println("array elements are:"+arr1);
//compare the array elements
if(arr.equals(arr1)){
System.out.println("both elements are same");
}
else
{
System.out.println("both elements are not same");
}
}
}