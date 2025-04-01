import java.util.*;
class factorial
{
	public static void main(String args[])
	{
	 int a,fact=1,i,fact1=1;
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter a number");
	 a=sc.nextInt();
	 for(i=1;i<=a;i++)
	 {
	  fact*=i;
	 }
	 System.out.println("factorial="+fact);
	 i=1;
	 while(i<=a)
	 {
	 fact1*=i;
	 i++;
	 }
            System.out.println("factorial="+fact);
           }
}
            
