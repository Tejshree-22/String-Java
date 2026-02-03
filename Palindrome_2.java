package java_Package_String;

public class Palindrome_2 {

	public static void main(String[] args) {

		 String original = "level", reverse = "";  
	        
	     int length = original.length();   // finds the length of the string 
	       
	      for (int i = length - 1; i >= 0; i--)   // iterate over each character of the string  
	             
	         reverse = reverse + original.charAt(i);   // reverse the string
	       
	      if (original.equals(reverse))  		  // compares the string 
	            System.out.println("The string is a palindrome.");  
	      else  
	            System.out.println("The string is not a palindrome.");  
	    }  
	}  



