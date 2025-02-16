import java.util.*;
public class ArrayListExample19{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
ArrayList<Integer> arr=new ArrayList<>(n);
for(int i=0;i<n;i++){
int element=scan.nextInt();
arr.add(element);
if(element==3){
break;
}
}
//display the array elements 
System.out.println("Array elements are:"+arr);
System.out.println("Before trimming:"+arr.size());
//trim the capacity of array elements

arr.trimToSize();
System.out.println("Before trimming:"+arr.size());
}
}