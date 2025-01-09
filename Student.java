import java.util.*;
class Student{
public static void main(String[] args)
{
Scanner student=new Scanner(System.in);
System.out.println("Enter the studentdetails");
System.out.println("name");
String StudentName=student.nextLine();
System.out.println("Enter the studentsName:"+StudentName);
System.out.println("rollno");
int StudentRollNo=student.nextInt();
System.out.println("Enter the students rollno:"+StudentRollNo);
System.out.println("number");
int StudentNumber=student.nextInt();
System.out.println("Enter the students number:"+StudentNumber);
student.nextLine();
System.out.println("class");
String StudentClass=student.nextLine();
System.out.println("Enter the students class:"+StudentClass);
System.out.println("section");
String StudentSection=student.nextLine();
System.out.println("Enter the students section:"+StudentSection);
System.out.println("-------------------------------------");
System.out.println("mark details");
int mark1=student.nextInt();
System.out.println("Enter the matk1:"+mark1);
int mark2=student.nextInt();
System.out.println("Enter the students mark2:"+mark2);
int mark3=student.nextInt();
System.out.println("Enter the students mark3:"+mark3);
int mark4=student.nextInt();
System.out.println("Enter the students mark4:"+mark4);
int mark5=student.nextInt();
System.out.println("Enter the students mark5:"+mark5);
int total =mark1+mark2+mark3+mark4+mark5;
int average=total/5;
System.out.println("Enter the students roll no:"+average);
System.out.println("---------------------------------------");






}
}