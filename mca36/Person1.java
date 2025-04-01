import java.util.*;
class person
{
  String Name,Gender,Address;
  int Age;
  person(String Name,String Gender,String Address,int Age)
  {
    this.Name=Name;
    this.Gender=Gender;
    this.Address=Address;
    this.Age=Age;
  }
}
class Employee extends person
{
  int Empid,Salary;
  String Company_name,Qualification;
  Employee(String Name,String Gender,String Address,int Age,int Empid,int Salary,String Company_name,String Qualification)
  {
    super(Name,Gender,Address,Age);
    this.Empid=Empid;
    this.Salary=Salary;
    this.Company_name=Company_name;
    this.Qualification=Qualification;
  }
}
class Teacher extends Employee
{
  int Teacher_id;
  String Subject,Department;
  Teacher(String Name,String Gender,String Address,int Age,int Empid,int Salary,String Company_name,String Qualification,String  Subject,int Teacher_id,String Department)
  {
  super(Name,Gender,Address,Age,Empid,Salary,Company_name,Qualification);
  this.Teacher_id=Teacher_id;
  this.Subject=Subject;
  this.Department=Department;
  }

   void display()
   {   
       System.out.println("Name:"+Name);
       System.out.println("Gender="+Gender);
       System.out.println("Address="+Address);
       System.out.println("Empid:"+Empid);
       System.out.println("Company_name:"+Company_name);
       System.out.println("Qualification"+Qualification);
       System.out.println("Salary:"+Salary);
       System.out.println("Teacher_id:"+Teacher_id);
       System.out.println("Subject:"+Subject);
       System.out.println("Department:"+Department);
       
   }
}
  
public class Person1
{
  public static void main (String args[]) 
  {
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of teachers:");
    n=sc.nextInt();
    sc.nextLine();
    Teacher[] teachers=new Teacher[n];
    for(i=0;i<n;i++)
    {
    System.out.println("Enter the name:");
    String Name=sc.nextLine();
    System.out.println("enter gender:");
    String Gender=sc.nextLine();
    System.out.println("enter Address:");
    String Address=sc.nextLine();
    System.out.println("enter Age:");
    int Age=sc.nextInt();
    System.out.println("enter Employeeid:");
    int Empid=sc.nextInt();
    System.out.println("enter Salary:");
    int Salary=sc.nextInt();
    sc.nextLine();
    System.out.println("enter Company Name:");
    String Company_name=sc.nextLine();
    System.out.println("enter qualification:");
    String Qualification=sc.nextLine();
    System.out.println("enter Teacherid:");
    int Teacher_id=sc.nextInt();
    sc.nextLine();
    System.out.println("enter Subject:");
    String Subject=sc.nextLine();
    System.out.println("enter Department:");
    String Department=sc.nextLine();
    teachers[i]=new Teacher(Name,Gender,Address,Age,Empid,Salary,Company_name,Qualification,Subject,Teacher_id,Department);
    }
    for(i=0;i<n;i++)
    {
      System.out.println("teacher details");
      teachers[i].display();
    }
    
  }
}          
