import java.util.*;
public class ArrayListExample4{
public static void main(String[] args){
ArrayList<String> arr=new ArrayList<>();
//adding the element at the arraylist
arr.add("ragavi");
arr.add("ramya");
arr.add("akila");
arr.add("vishu");
arr.add("ragul");
System.out.println("retrieve the specific postion at index:"+arr);
//retrieve the specific postion at index
arr.get(0);
System.out.println("retrieve the specific postion at index:"+arr.get(0));
}
}