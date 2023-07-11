Reverse a string in Java:--->
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static String reverse(String str){
        int n=str.length()-1;
        String reversed="";
     for(int i=n;i>=0;i--){
      reversed+=str.charAt(i);
     }
        return reversed;
     
        
    }
	public static void main (String[] args) {
		System.out.println("GfG!");
		String str="Kushal";
	    System.out.println(reverse(str));
	}
}
