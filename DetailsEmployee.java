import java.util.*;
class Person{
String firstname;
char lastname;
void getFirstName(String firstname){
this.firstname=firstname;
System.out.println("person firstname is:"+firstname);
}
void getLastName(char lastname){
this.lastname=lastname;
System.out.println("person lastname is:"+lastname);
}
}
class Employee extends Person{
int id;
void getEmployeeid(int id){
this.id=id;
System.out.println("employee id number:"+id);
}
String title;
void getLastName(String title)
{
this.title=title;
System.out.println("employee job role is:"+title);
}
}
public class DetailsEmployee{
public static void main(String[] args){
Employee e1=new  Employee();
e1.getFirstName("snega");
e1.getEmployeeid(101);
e1.getLastName("data engineer");
}
}
