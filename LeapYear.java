import java.util.*;
public class LeapYear{
public static void main(String[] args){
Scanner snega=new Scanner(System.in);
int year=snega.nextInt();
if((year%4==0 && year%100!=0) || (year%400==0))
{
System.out.println("this is a leap year");
}
else{
System.out.println("Not leap year");
}
}
}
