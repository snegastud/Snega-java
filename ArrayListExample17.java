import java.util.*;
public class ArrayListExample17{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the array elements :");
int n=scan.nextInt();
ArrayList<Integer> arr=new ArrayList<>(n);
for(int i=0;i<n;i++)
{
arr.add(scan.nextInt());
}
//display the array elements
System.out.println("array elements are:"+arr);
//create a empty arrayList
arr.clear();
//
System.out.println("after clear array elements are:"+arr);
}
}