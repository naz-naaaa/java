import java.util.*;
class Fibonacci implements Runnable
{
  public void run()
  {
    int num1=0,num2=1;
    System.out.println("Fibonacci series:");
    for(int i=0;i<10;i++)
    {
      System.out.println(num1+"");
      int nextnum=num1+num2;
      num1=num2;
      num2=nextnum;
    }
  }
}
class Evennumber implements Runnable
{
  public void run()
  {
    System.out.println("even numbers between 1 and 20 are:");
    for(int j=1;j<20;j++)
    {
      if(j%2==0)
      {
        System.out.println(j+"");
      }
    }
  }
}
public class Run
{
  public static void main(String args[])
  {
    Fibonacci fib=new Fibonacci();
    Evennumber eve=new Evennumber();
    Thread tfib=new Thread(fib);
    Thread teve=new Thread(eve);
    tfib.start();
    teve.start();
  }
}
      
