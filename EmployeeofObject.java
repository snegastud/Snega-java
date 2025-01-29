import java.util.*;
class EmployeeArray{
int empid;
String empname;
int empsalary;
String empdesignation;
String gender;
String city;
EmployeeArray(int empid,String empname,int empsalary,String empdesignation,String gender,String city){
this.empid=empid;
this.empname=empname;
this.empsalary=empsalary;
this.empdesignation=empdesignation;
this.gender=gender;
this.city=city;
}
public void display(){
System.out.println("employee id=:" +empid +"employeename=:" +empname +"employeesalary=:" +empsalary+ "employeedesignation=:" +empdesignation+ "gender=:" +gender+ "city=:" +city);
}
}
public class EmployeeofObject{
public static void main(String[] args){
EmployeeArray[] arr;
arr=new EmployeeArray[5];
arr[0]=new EmployeeArray(10,"snega",20000,"developer","female","chennai");
arr[1]=new EmployeeArray(11,"nanthinipriya",30000,"software engineer","female","covai");
arr[2]=new EmployeeArray(12,"rahulkannan",50000,"testing","male","bangalor");
arr[3]=new EmployeeArray(13,"somanathan",50000,"developer","male","chennai");
arr[4]=new EmployeeArray(14,"ramya",40000,"data analayst","female","chennai");
System.out.println("student data arr[0]");
arr[0].display();
System.out.println("student data arr[1]");
arr[1].display();
System.out.println("student data arr[2]");
arr[2].display();
System.out.println("student data arr[3]");
arr[3].display();
System.out.println("student data arr[4]");
arr[4].display();
}
}