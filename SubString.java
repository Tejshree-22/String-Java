package java_Package_String;

public class SubString {

	public static void main(String[] args) {

		String s1 = "Tejshree" ;
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 8));
		
		
		String rev = "";
		for (int i=s1.length()-1 ; i >= 0 ; i--)
		{
			rev = rev + s1.charAt(i);
		}
		System.out.println("rev is: " +rev );
	}

}
