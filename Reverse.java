package java_Package_String;

public class Reverse {

	public static void main(String[] args) {
	
		 String s = "Geeks";
	     String r = "";

	        for (int i = 0; i < s.length(); i++){
	            
	            r = s.charAt(i) + r;   // prepend each character
	        }
	        System.out.println(r);
	    }
		

		//String input = "mkt" ;
		//String output = "" ;
		//for (int i = input.length() - 1 ; i >= 0 ; i-- )	
		//output = output + input.charAt(i) ;
		//System.out.println(output);
	}


