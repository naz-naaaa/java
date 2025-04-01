import java.util.*;
class stringop
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first string:");
String str1 = sc.nextLine(); 
System.out.println("Enter the second string:");
String str2 = sc.nextLine();
String copyStr1 = str1;

System.out.println("Copied String:");
System.out.println("Copy of first string: " +copyStr1);
System.out.println("String comparison:");

if(str1.equals(str2)) 
{
System.out.println("Both strings are equal");
} 
else 
{
System.out.println("Strings are not equal");
}
System.out.println("\nLength of Strings:");
System.out.println("Length of first string: "+str1.length());
System.out.println("Length of second string: "+str2.length());
System.out.println("\nString concatenation:");
System.out.println("Concatenated string: "+str1.concat(str2));
}
}

