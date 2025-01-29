import java.util.*;
public class FindMax{
static void Max(int arr[]){
int Max=arr[0];
for(int i=0;i<arr.length;i++){
if(Max<arr[i]){
Max=arr[i];
}  
}
System.out.println("Maximum number is:"+Max);

}
public static void main(String[] args){
int n;
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
}
 
Max(a);
}
}