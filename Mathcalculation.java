import java.util.*;
class Shape{
int perimeter;
int area;
void getPerimeter(int perimeter){
this. perimeter=perimeter;
int meter=perimeter*4;
System.out.println("the perimeter of square is:"+meter);
}
void getArea(int area){
this.area=area;
int a=area^2;
System.out.println("the area of square is:"+a);
}
}
class Circle extends Shape{
int a;
int b;
void getPerimeter(int a)
{
this.a=a;
int c=2*22/7*a;
System.out.println("circle perimeter value is:"+c);
}
void getArea(int b){
this.b=b;
int c1=22/7*b*b;
System.out.println("circle area value is:"+c1);
}
}
public class Mathcalculation{
public static void main(String[] args){
Circle c1=new Circle();
c1.getPerimeter(4);
c1.getArea(3);
}
}
