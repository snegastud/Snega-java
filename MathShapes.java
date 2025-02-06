import java.util.*;
abstract class Shapes{
abstract void calculateArea();
abstract void calculatePerimeter();
}
class Circle extends Shapes{
int r;
Circle(int r){
this.r=r;
}
void calculateArea(){
int area=22/7*r^2;
System.out.println("circle area:"+area);
}
void calculatePerimeter(){
int perimeter=2*22/7*r;
System.out.println("circle perimeter:"+perimeter);
}
}
class Triangle extends Shapes{
int a,b,c,h;
Triangle(int a,int b,int c,int h){
this.a=a;
this.c=c;
this.b=b;
this.h=h;
}
void calculateArea(){
double area=0.5*b*h;
System.out.println("triangle area:"+area);
}
void calculatePerimeter(){
double perimeter=a+b+c;
System.out.println("triangle perimeter:"+perimeter);
}
}
public class MathShapes{
public static void main(String[] args){
Shapes C1=new Circle(20);
C1.calculateArea();
C1.calculatePerimeter();
Shapes T1=new Triangle(10,20,30,5);
T1.calculateArea();
T1.calculatePerimeter();
}
}
