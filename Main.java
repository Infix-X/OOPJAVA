package Polymorphism;

public class Main {
    public static void main(String[]args){
        Animal A1=new Animal();
        Bird b1=new Bird();
        b1.leg=2;
        System.out.println(b1.leg);
        b1.fly();
        Peacock p1=new Peacock();
        p1.spread();
 }
}
class Animal{
        String color;
        String breeth;
        void eat(){
            System.out.println("Eat");
        }
        void breeth(){
            System.out.println("breeth");
        }
    }
        
    
    class Bird extends Animal{
        int leg;
        void fly(){
            System.out.println("Birds are flying... ");
        }
    }
    class Peacock extends Bird{
        void spread(){
            System.out.println("Its long feather");
        }
    }
    class Fish extends Animal{
        void swim(){
            System.out.println("In water");
        }
         
        
    }
    class Tuna extends Fish{
        int weight;

    }
    class shark extends Tuna{
        int weight;
        void eatmeat(){
            System.out.println("Yes!!");
        }
        
    }
    class mammals{
        int leg;

    }
    class Dog extends mammals{
        void breed(int leg){
            this.leg=leg;
            System.out.println("German Shephard");

        }
    }
    class  cat extends mammals{
        void breed(){
            System.out.println("Indian");
            
        }
    }
    class Human extends mammals{
        void countleg(int leg){
            this.leg=leg;
            String color1;
            String color2;
        }

    }
 

  

