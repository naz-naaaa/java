package Graphics;
import java.util.*;
public class square
{
   double a;
   Scanner sc=new Scanner(System.in);
   public void area()
   {
     System.out.print("Enter the side:");
     int s=sc.nextInt();
     sc.nextLine();
     a=s*s;

   }

   public void display()
   {
     System.out.println("Area of the square:"+a);
   }
}
  
