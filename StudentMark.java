import java.util.*;
public class StudentMark{
String student_name;
int student_id;
int student_mark1;
int student_mark2;
int student_mark3;
int student_mark4;
StudentMark(String a,int b){
student_name=a;
student_id=b;
System.out.println("student name is:"+student_name);
System.out.println("student id is:"+student_id);}
StudentMark(int c,int d,int e,int f){
student_mark1=c;
student_mark2=d;
student_mark3=e;
student_mark4=f;
System.out.println("Student marks details");
System.out.println("Student marks1 is="+student_mark1);
System.out.println("Student marks2 is="+student_mark2);
System.out.println("Student marks3 is="+student_mark3);
System.out.println("Student marks4 is="+student_mark4);
System.out.println("----------------------------------");
}
public static void main(String[] args){
StudentMark mark=new StudentMark("snega",101);
StudentMark mark1=new StudentMark(90,82,73,70);
StudentMark mark2=new StudentMark("nanithipriya",102);
StudentMark mark3=new StudentMark(95,62,70,50);
}
}