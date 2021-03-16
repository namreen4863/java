package oopm;

public class Product {
    int id;
    int quantity;
    int price;
    
    public Product(int id,int quantity,int price){
        this.id=id;
        this.quantity=quantity;
        this.price=price;
    }
    
    public void printData(){
        System.out.println("ID = :"+id);
        System.out.println("QUANTITY = :"+quantity);
        System.out.println("PRICE = :"+price);
    }
}