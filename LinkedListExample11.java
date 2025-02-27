import java.util.*;
public class LinkedListExample11{
public static void main(String[] args){
LinkedList<Integer> arr=new LinkedList<>();
//add the elements
arr.add(50);
arr.add(60);
arr.add(70);
arr.add(80);
arr.add(90);
//display the array elements
System.out.println("array elements are:"+arr);
//display the element postion
for(int i=0;i<arr.size();i++)
{
System.out.println("the element positon"+" "+i+ " " + "is" +" " +"element at="+arr.get(i));
}

}
}
