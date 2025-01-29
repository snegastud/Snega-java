import java.util.*;
public class EvenorOdd{
static void Number(int arr[]){
for(int i=0;i<arr.length;i++){
if(arr[i]%2==0){
System.out.println("this number is even number="+arr[i]);
}
else{
System.out.println("this number is odd number="+arr[i]);
}
}

}
public static void main(String[] args){
int n;
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=scan.nextInt();
}
Number(a);
}
}