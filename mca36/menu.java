import java.util.*;
class menu
{
 public static void main(String args[])
  {
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of string in array:");
    int n=sc.nextInt();
    sc.nextLine();
    String arr[]=new String[n];
    System.out.println("Enter "+n+"string");
    for(i=0;i<n;i++)
     {
      arr[i]=sc.nextLine();
     }
     while(true)
      {
       int choice;
       System.out.println("menu:\n1.search a string from an array:\n2.sort the array:\n3.display:\n4.exit");
       choice=sc.nextInt();
       sc.nextInt();
       switch(choice)
        {
          case 1:
          System.out.println("enter the string to search:");
          String target=sc.nextLine();
          boolean found=false;
          for(i=0; i<arr.length; i++)
           {
             if(arr[i].equalsIgnoreCase(target))
              {
               System.out.println("String found at index:"+(i+1));
               found=true;
               break;
              }
           }
           if(!found)
            {
             System.out.println("string is not found");
            }
            break;
            case 2:
             Arrays.sort(arr);
             System.out.println("sorted array is:"+Arrays.toString(arr));
             break;
            case 3:
             System.out.println("the array elements:");
             for(i=0;i<arr.length;i++)
              {
               System.out.println(arr[i]);
              }
            break;
            case 4:
             System.out.println("existing.......");
            break;
            default:
             System.out.println("Inavlid");
          }
       }
  }  
}     
       
     
