
package Constructor;
import java.util.*;
import java.util.Scanner;
    public class Complex{
        double real;
        double image;
        public Complex(){
            this.real=0;
            this.image=0;
    
        }
        public Complex(double real,double img){
            this.real=real;
            this.image=img;
        }
     public static void main(String[] args) {
        Complex n1= new Complex(2.6,1.2),n2=new Complex(3.2,4.6),temp;
        temp=add(n1,n2);
        System.out.printf("\n addition of given complex number is:");
        display(temp);
        temp=sub(n1,n2);
        System.out.printf("\nSubtraction of given complex number is:");
        display(temp);
        temp=mul(n1,n2);
        System.out.printf("Multiplication of given complex number is:");
        display(temp);
     }
            public static Complex add(Complex n1,Complex n2){
                Complex temp= new Complex();
                temp.real=n1.real+n2.real;
                temp.image=n1.image+n2.image;
                return(temp);
        
            }
            public static  Complex sub(Complex n1,Complex n2){
                Complex temp= new Complex();
                temp.real=n1.real-n2.real;
                temp.image=n1.image-n2.image;
                return(temp);
        
            }
            public static Complex mul(Complex n1,Complex n2){
                Complex temp= new Complex();
                temp.real=(n1.real*n2.real)+(n1.image*n2.image*-1);
                temp.image=(n1.image*n2.real)+(n2.image*n1.real);
                return(temp);
        
            }
            public static void display(Complex n){
                if(n.image>=0)
                System.out.printf("\t=%.1f+%.1fi",n.real,n.image);
                else
                System.out.printf("\t=%.if %.1fi",n.real,n.image);
            }
           
    

}
   
