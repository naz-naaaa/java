package Graphics;
import java.util.*;
public class rectangle
{
   float a,l,b;
   Scanner sc=new Scanner(System.in);
   public void area()
   {
     System.out.print("Enter length of rectangle:");
     float l=sc.nextFloat();
     System.out.print("Enter breadth of rectangle:");
     float b=sc.nextFloat();
     a=l*b;
   }
   public void display()
   {
     System.out.println("Area of the rectangle:"+a);
   }
}
     
