import java.util.*;
public class ArrayListExample2{
public static void main(String[] args){
ArrayList<Integer> arr=new ArrayList<>();
arr.add(10);
arr.add(20);
arr.add(30);
arr.add(40);
arr.add(50);
for(int i=0;i<arr.size();i++){
System.out.println("array elements are interating:"+arr.get(i));
}
}
}