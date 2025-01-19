import java.util.*;
public class EmployeeDetails{
int employee_id;
String employee_name;
int employee_age;
int employee_salary;
EmployeeDetails(int a,String b,int c,int d){
employee_id=a;
employee_name=b;
employee_age=c;
employee_salary=d;
System.out.println("-------------------------------------------");
System.out.println(" employee details" );
System.out.println(" employee id is:"+employee_id);
System.out.println(" employee name is:"+employee_name);
System.out.println(" employee age is:"+employee_age);
System.out.println(" employee salary is:"+employee_salary);
System.out.println("-------------------------------------------");
}
public static void main(String[] args){
EmployeeDetails employee=new EmployeeDetails(101,"snega",22,25000);
EmployeeDetails employee2=new EmployeeDetails(102,"nanthinipriya",21,55000);



}
}