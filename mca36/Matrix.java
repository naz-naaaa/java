import java.util.*;
class Matrix
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number of rows in matrix:");
  int rows=sc.nextInt();
  System.out.println("enter number of columns in matrix:");
  int cols=sc.nextInt();
  int [][] matrix1=new int[rows][cols];
  int [][] matrix2=new int[rows][cols];
  int [][] resultAdd=new int[rows][cols];
  int [][] resultMult=new int [rows][cols];
  System.out.println("enter elements in the matrix1:");
  for(int i=0;i<rows;i++)
  {
   	for(int j=0;j<cols;j++)
   	matrix1[i][j]=sc.nextInt();
  }
  System.out.println("enter elements in the matrix2:");
  for(int i=0;i<rows;i++)
  {
  	for(int j=0;j<cols;j++)
  	matrix2[i][j]=sc.nextInt();
  }
  System.out.println(" Addition");
  for(int i=0;i<rows;i++)
  {
  	for(int j=0;j<cols;j++)
  	resultAdd[i][j]=matrix1[i][j]+matrix2[i][j];
  }
  System.out.println("rows:"+rows+ " Cols:"+cols);
  for(int i=0;i<rows;i++)
  {
   for(int j=0;j<cols;j++)
   
     System.out.println(resultAdd[i][j]+"");
   
   System.out.println("");
  }
  if(rows==cols)
  System.out.println("matrix Multiplication:");
  for(int i=0;i<rows;i++)
  {
   for(int j=0;j<cols;j++)
   {
   resultMult[i][j]=0;
  for(int k=0;k<cols;k++)
  {
     resultMult[i][k]+=matrix1[i][k]*matrix2[i][k];
  }
  }
  }
  System.out.println("rows:"+rows+ " Cols:"+cols);
  for(int i=0;i<rows;i++)
  {
   for(int j=0;j<cols;j++)
   
     System.out.println(resultMult[i][j]+"");
   
   System.out.println("");
  }
 }
}


 

  
