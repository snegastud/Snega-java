import java.util.*;
public class ArrayDimension{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of rows:");
int row=scan.nextInt();
System.out.println("Enter the number of colums:");
int col=scan.nextInt();
int[][] arr=new int[row][col];
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
arr[i][j]=(i+1)*(j+1);
}
}
for(int i=0;i<row;i++){
for(int j=0;j<col;j++){
System.out.print(arr[i][j]+"");
}
System.out.println();
}
}
}