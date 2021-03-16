package oopm;
import java.util.Scanner;

public class Package {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("ENTER THE PRODUCT ID: ");
        int id = sc.nextInt();
        
         System.out.println("ENTER THE PRODUCT QUANTITY: ");
         int quantity = sc.nextInt();
         
          System.out.println("ENTER THE PRODUCT PRICE: ");
          int price = sc.nextInt();
          Product product = new Product (id,quantity,price);
          
          product.printData();
    }
}
