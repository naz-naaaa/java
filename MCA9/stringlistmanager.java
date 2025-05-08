import java.util.*;
public class stringlistmanager
{
  public static void main(String args[])
  {
    ArrayList<String>st=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    st.add("Apple");
    st.add("Orange");
    st.add("banana");
    st.add("kiwi");
    System.out.println("initial List:"+st);
    System.out.println("Enter a string to add:");
    String input=sc.nextLine();
    st.add(input);
    System.out.println("List after adding:"+st);
    st.remove("Orange");
    System.out.println("List after removing 'Orange':"+st);
    Collections.sort(st);
    System.out.println("sorted List:"+st);
    System.out.println("Enter a string to search:");
    String search=sc.nextLine();
    if(st.contains(search))
    {
      System.out.println(search+"is in the list");
    }
    else
    {
      System.out.println(search+"is not in the list");
    }
    System.out.println("Total no of elements:"+st.size());
    }
 }
    
