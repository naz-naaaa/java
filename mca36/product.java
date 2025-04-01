class product
{
 int pcode;
 String pname;
 float price;
 public product(pcode,pname,price)
 {
  Scanner sc=new Scanner(System.in);
  Syztem.out.println("enter the pcode,pname,price");
  code=sc.nextInt();
  sc.nextLine();
  String new=sc.nextInt();
  price=sc.nextInt();
 }
 void display()
 {
  System.out.println("code"+pcode);
  System.out.println("name"+pname);
  System.out.println("price"+price);
 }
}
