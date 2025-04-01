import java.util.Scanner;

class Product {
    int pcode;
    String pname;
    int price;

    Product(int code, String name, int price1) {
        this.pcode = code;
        this.pname = name;
        this.price = price1;
    }
}

public class Product1
 {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the code of product 1 :");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the product name of first product :");
        String name = sc.nextLine();
        System.out.println("Enter the price of product 1 :");
        int price = sc.nextInt();
        
        
        
        System.out.println("Enter the code of product 2 :");
        int code2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the product name of second product :");
        String name2 = sc.nextLine();
        System.out.println("Enter the price of product 2 :");
        int price2 = sc.nextInt();

        System.out.println("Enter the code of product 3 :");
        int code3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the product name of third product :");
        String name3 = sc.nextLine();
        System.out.println("Enter the price of product 3 :");
        int price3= sc.nextInt();


        
        Product p1 = new Product(code, name, price);
        Product p2 = new Product(code2, name2, price3);
        Product p3 = new Product(code3, name3, price3);

     
        Product lowestPrice = p1;
        if (p2.price < lowestPrice.price) 
        {
            lowestPrice = p2;
        }
        if (p3.price < lowestPrice.price) 
        {
            lowestPrice = p3;
        }
        System.out.println("Product with the lowest price is:");
        System.out.println("Product code: " + lowestPrice.pcode);
        System.out.println("Product Name: " + lowestPrice.pname);
        System.out.println("Product price: " + lowestPrice.price);
    }
}


