package java_Package_String;

public class Palindrome {

	public static void main(String[] args) {

		String name = "madam" ;
		String reverse = " " ;
		
		System.out.println("the given name is :" +name );
		
		//for (int i = 0; i < name.length(); i++)
		for (int i = name.length()-1 ; i>=0 ; i--)
		{
			char c1 = name.charAt(i) ;
			reverse = reverse + c1  ;
		}
		System.out.println("the reverse is :" +reverse );
		
		if (name.equals(reverse))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is NOT Palindrome");
		}
		
	}

}
