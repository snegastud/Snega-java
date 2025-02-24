import java.util.*;
public class ArrayListExample21{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the array elements :");
int a=scan.nextInt();
ArrayList<Integer> arr=new ArrayList<>(a);
for(int i=0;i<a;i++){
int a1=scan.nextInt();
arr.add(a1);
}
//display the array elements
System.out.println("Array elements are:"+arr);
//Access the second element in the array
arr.set(1,20);
System.out.println("after the replace array elements:"+arr);


}
}