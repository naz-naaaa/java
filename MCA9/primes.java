import java.util.*;
class multiple extends Thread
{
  public void run()
  {
    System.out.println("Multiple of 5:");   
    for(int i=1;i<=10;i++)
   
    {
      System.out.println("5x"+ i +"="+5*i);
    }
  }
}
class Prime extends Thread
{
  public void run()
  {
    int i,j;
    for(j=2;j<10;j++)
    {
      int flag=0;
      for(i=2;i<=j/2;i++)
      {
        if(j%i==0)
        {
          flag=1;
          break;
        }
      }
      if(flag==0)
      {
        System.out.println("prime number are:"+j);
       }
    }
  }
}
class primes
{
  public static void main(String args[])
  {
    multiple m=new multiple();
    Prime P=new Prime();
    
    P.start();
    m.start();
  }
}
