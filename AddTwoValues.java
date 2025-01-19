import java.util.*;
public class AddTwoValues{
void addition(int a,int b){
int total_value=a+b;
System.out.println("add the two numbers result is="+total_value);
}
public static void main(String[] args){
AddTwoValues add=new AddTwoValues();
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
int num1=scan.nextInt();
add.addition(num,num1);
}
}