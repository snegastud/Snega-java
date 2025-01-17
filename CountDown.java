import java.util.*;
public class CountDown{
public static void main(String[] args){
Scanner snega=new Scanner(System.in);
int num=snega.nextInt();

do{
System.out.println(num);
num=num-1;
}
while(num>0);
}
}