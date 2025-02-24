import java.util.*;
public class LinkedListExample4{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the number of element you want:");
//enter the number of element
int a=scan.nextInt();
scan.nextLine();
LinkedList<String> arr=new LinkedList<>();
//traves the array element
for(int i=0;i<a;i++){
String element=scan.nextLine();
arr.add(element);
}
System.out.println("array elements are:"+arr);
//iterator through the array element 
//reverse the iterator 
Iterator<String> it=arr.descendingIterator();
while(it.hasNext()){
System.out.println(" Reverse iterator is:"+it.next());
}

}
}