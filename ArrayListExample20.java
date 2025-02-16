import java.util.*;
public class ArrayListExample20{
public static void main(String[] args){
System.out.println("enter the elements:");
Scanner scan=new Scanner(System.in);

int n=scan.nextInt();
scan.nextLine();
ArrayList<String> arr=new ArrayList<>(n);
for(int i=0;i<n;i++){
String element=scan.nextLine();
arr.add(element);
}
//display the array elements
System.out.println("array elements are:"+arr);
System.out.println("array size is:"+arr.size());
//increasing the capacity of the array elements 
System.out.println("enter the elements increasing capacity:");
arr.ensureCapacity(n*2);
int n1=scan.nextInt();
scan.nextLine();
//
System.out.println("enter"+n1+"integer");

for(int i=0;i<n1;i++)
{
String a=scan.nextLine();
arr.add(a);
}
System.out.println(" after increasing the array size is:"+arr.size());
System.out.println("After ensuring the array capacity:"+arr);
}
}
