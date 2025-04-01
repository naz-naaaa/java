import java.util.*;
class CPU
{
 float price;
 CPU(float price)
  {
   this.price=price;
  } 
  void displayprice()
  { 
    System.out.println("price of cpu:"+price);
  }
   
 class Processor
 {
  int nocores;
  String manufacture;
  Processor(int nocores,String manufacture)
  {
   this.nocores=nocores;
   this.manufacture=manufacture;
  }
  void displayProcessor()
  {
    System.out.println("processor information");
    System.out.println("number of cores:"+nocores);
    System.out.println("manufacture:"+manufacture);
   }
  }
  
 static class RAM
 {
  int memory;
  String mnf;
  RAM(int memory,String mnf)
   {
     this.memory=memory;
     this.mnf=mnf;
   }
     void displayram()
    {
      System.out.println("memory space");
      System.out.println("memory size :"+memory);
      System.out.println("Manufactore:"+mnf);
    }
 }
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the price of cpu:");
    float price=sc.nextFloat(); 
    
    CPU cpu=new CPU(price);
    System.out.println("enter the no.of cores of processor:");
    int nocores=sc.nextInt();
    sc.nextLine();
    
    System.out.println("enter the manufactore of the processor:");
    String Processor_manufacture=sc.nextLine();
    //sc.nextLine();
    
    CPU.Processor processor=cpu.new Processor(nocores,Processor_manufacture);
    System.out.println("enter the size for Ram:");
    int memory=sc.nextInt();
    sc.nextLine();
    
    System.out.println("enter the manufacture ram:");
    String mnf=sc.nextLine();
    //sc.nextLine();
    
    CPU.RAM ram=new CPU.RAM(memory,mnf);
    processor.displayProcessor();
    ram.displayram();
    cpu.displayprice();
   }    
 }
 
 
  
