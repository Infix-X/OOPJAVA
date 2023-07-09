package Polymorphism;
import java.util.*;
public class Publication {
    String title;
    double price;
    int copies;
    //Constructor
    public Publication(){ 
        title="";
        price=0.0;
        copies=0;
    }

    public void SaleCopy(){
        System.out.println("\n Saparate Sale copy for Book and Magzine!!!");

    }
    //to get value for copie
    public int get_Copies(){
        return copies;
    }
    public void input(){
        Scanner in_obj=new Scanner(System.in);
        System.out.println("\n Enter title:\t");
        title=in_obj.nextLine();
        System.out.println(("\nEnter the price \t"));
        price=in_obj.nextDouble();
        System.out.println("\nEnter the number of copies sold:\t");
        copies=in_obj.nextInt();
    
    }
    public void diplay(){
        System.out.println("\n Title:\t"+title);
        System.out.println("\n price:\t"+price);
        System.out.println("\nNo.of copies:\t"+copies);
    }
    
}
class Book1 extends Publication{
    String Author;
    public Book1(){
        super();
        Author="";
    }
    @Override
    public void saleCopy(){
        double total_sale=0;
        total_sale=price*copies;
        System.out.println("\n Total sale of copy book!!");
        display_book();
        System.out.println(("\n total sale"+Author+"total_sale"));
    }
    public void orderCopies(){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n how many copies of book do you want to order?");
        n=sc.nextInt();
        copies=copies+n;
    }
    public void input_book(){
        input();
        System.out.println("\n Enter book author:\t");
        
    }
}
