package java_Package_String;

public class Count_Char {

	public static void main(String[] args) {

		int count_alpha = 0 ;
		int count_digit = 0 ;
		int count_space = 0 ;
		
		String name = "Tinks 123 &$" ;
		System.out.println(name.length());
		char [] c = name.toCharArray() ;
		
		for(int i = 0; i<name.length(); i++)
		 {	
			boolean answer1 = Character.isAlphabetic(c[i]) ;
			boolean answer2 = Character.isDigit(c[i]) ;
			boolean answer3 = Character.isSpace(c[i]) ;
			
			if(answer1 == true) 
			{
				count_alpha++ ;
			}
			if(answer2 == true) 
			{
				count_digit++ ;
			}
			if(answer3 == true) 
			{
				count_space++ ;
			}
		
		 }
		System.out.println("no of alphabets is :" + count_alpha);
		System.out.println("no of digit is : " + count_digit);
		System.out.println("no of space is : " + count_space);
		
		int spclChar_count = name.length() - (count_alpha + count_digit + count_space );
		System.out.println("no of specialChar is : " + spclChar_count);
	}

}
