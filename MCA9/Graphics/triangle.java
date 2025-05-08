package Graphics;
import java.util.*;
public class triangle
{
   double a,h,b;
   Scanner sc=new Scanner(System.in);
   public void area()
   {
     System.out.print("Enter the base:");
     double b=sc.nextDouble();
     System.out.print("Enter the height:");
     double h=sc.nextDouble();
     a=0.5*h*b;
   }

   public void display()
   {
     System.out.println("Area of the triangle:"+a);
   }
}
  
