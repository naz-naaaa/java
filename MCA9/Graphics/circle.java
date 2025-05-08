package Graphics;
import java.util.*;
public class circle
{
   double a,r;
   Scanner sc=new Scanner(System.in);
   public void area()
   {
     System.out.print("Enter radius of circle:");
     double r=sc.nextDouble();
     a=3.14*(r*r);
   }

   public void display()
   {
     System.out.println("Area of the circle:"+a);
   }
}
     
