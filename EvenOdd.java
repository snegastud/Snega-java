import java.util.*;
public class EvenOdd{
public static void main(String[] args){
Scanner snega=new Scanner(System.in);
int a=snega.nextInt();
if(a>=0){
if(a%2==0){
System.out.println("The number is even number");
}

else if (a%2!=0){
System.out.println("The number is odd number");
}
}
else{
System.out.println("invalid number. please enter a valid integer");
}
}
}