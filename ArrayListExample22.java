import java.util.*;
public class ArrayListExample22{
public static void main(String[] args){
ArrayList<Integer> arr=new ArrayList<>();
arr.add(10);
arr.add(20);
arr.add(30);
arr.add(40);
arr.add(50);
System.out.println("Array elements are:"+arr);
for(int i=0;i<arr.size();i++){
System.out.println("Arraylist position"+" "+i+":" +arr.get(i));
}
}
}