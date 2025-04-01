import java.util.*;
class FindArea
{
 void display(int side)
 {
  int area=side*side;
  System.out.println("Area of square:"+area);
 }
 void display(int length,int breadth)
 {
  int area=length*breadth;
  System.out.println("area of rectangle:"+area);
 }
 void display(float base,float height,boolean isTriangle)
 {
  float area=(base*height)/2;
  System.out.println("Area of triangle:"+area);
 }
}
 public class Area
 {
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     FindArea obj=new FindArea();
     System.out.println("enter the side of square:");
     int side=sc.nextInt();
     obj.display(side);
     
     System.out.println("enter the length:");
     int length=sc.nextInt();
     System.out.println("enter the breadth:");
     int breadth=sc.nextInt();
     obj.display(length,breadth);
     
     System.out.println("enter the base of the triangle:");
     float base=sc.nextFloat();
     System.out.println("enter the height of the triangle:");
     float height=sc.nextFloat();
     obj.display(base,height,true);
    }
 } 
    
     
