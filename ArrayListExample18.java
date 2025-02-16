import java.util.*;
public class ArrayListExample18{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the array elements:");
int n=scan.nextInt();
ArrayList <Integer> arr=new ArrayList<Integer>(n);
for(int i=0;i<n;i++){
arr.add(scan.nextInt());
}
//display the array elements 
System.out.println("Array elements are:"+arr);
//check the array elements are exist are not.
if(arr.isEmpty()){
System.out.println("The array elements are empty");
}
else
{
System.out.println("The array elements are not empty");
}
//clear the array elements 
arr.clear();
//display the array elements
System.out.println("Array elements are:"+arr);
if(arr.isEmpty()){
System.out.println("The array elements are empty");
}
else{
System.out.println("The array elements are not empty");
}

}
}