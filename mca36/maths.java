import java.util.*;
class maths
{
	public static void main(String args[])
	{
		int a,b,sum=0,diff=0,p=0,div=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		diff=a-b;
		p=a*b;
		div=a/b;
		System.out.println("sum"+sum);
		System.out.println("differenece"+diff);
		System.out.println("product"+p);
		System.out.println("division"+div);
	}
}
