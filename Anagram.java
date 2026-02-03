package java_Package_String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "ram";
		String str2 = "arm";
		
		char [] c1 = str1.toCharArray() ; // [r,a,m] 		//convert to char arr
		char [] c2 = str2.toCharArray() ; //[a,r,m]
		
		Arrays.sort(c1); // [a,m,r]							//rem the functions
		Arrays.sort(c2); // [a,m,r]
		
		if ( Arrays.equals(c1, c2) == true ) {				//rem the function
			System.out.println("it is anagram");
		}
		else {
			System.out.println("it is  NOT an anagram");
		}
	}

}
