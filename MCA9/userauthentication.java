import java.util.*;
class Authentication extends Exception
{
  public Authentication(String Message)
  {
    super(Message);
  }
}
class userauthentication
{
  public static void authenticatellses(String username,String password)throws Authentication
  {
    String validuser="admin";
    String validpass="password13";
    if(username.isEmpty()||password.isEmpty())
    {
      throw new Authentication(" username or password is empty");
    }
    if(username.length()<5||password.length()<8)
    {
      throw new Authentication(" username mustbe atleast 5 charecter and password must be 8 charecter");
    }
    if(!username.equals(validuser))
    {
      throw new Authentication(" invalid  username");
    }
    if(!password.equals(validpass))
    {
      throw new Authentication(" invalid  password");
    }
    System.out.println("Authentication successfull!.");
      
   }
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter username:");
  String username=sc.nextLine();
  System.out.println("Enter password:");
  String password=sc.nextLine();
  try
  {
    authenticatellses(username,password);
  }
  catch(Authentication a)
  {
      System.out.println("Authentification failed"+a.getMessage());
  }
 }
}
  
  
