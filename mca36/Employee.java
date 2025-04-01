import java.util.*;
class Employee
{
 int empNo;
 String empName;
 double empSalary;
 {
  this.empNo=empNo;
  this.empName=empName;
  this.empSalary=empSalary;
 }
 void display()
 {
  System.out.println("Employee number:"+empNo);
  System.out.println("Employee name:"+empName);
  System.out.println("Employee salary:"+empSalary);
 }
}
public class EmployeeSearch
{
 public static void main(String args[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number of employee:");
  int n=sc.nextInt();
  Employee[] employees=new Employee[n];
  for(i=0;i<n;i++)
  {
   System.out.println("enter details of employee"+(i+1));
   System.out.println("Employee number:");
   int empNo=sc.nextInt();
   sc.nextLine();
   System.out.println("Employee Name:");
   String empName=sc.nextLine();
   System.out.println("Employee salary:");
   double empSalary=sc.nextDouble();
   employee[i]=new Employee(empNo,empName,empSalary);
  }
  System.out.println("/n enter employee number to search:");
  int serachEno=sc.nextInt();
  boolean found=false;
  for(Employee emp:employee)
  	{
  	  if(emp.empNo==searchEno)
  	  {
  	  	System.out.println("employee found");
  	  	emp.display();
  	  	found=true;
  	  	break;
  	  }
  	 }
  }
  if(!found)
  {
   	System.out.println("employee not found");
  }
 }
} 
