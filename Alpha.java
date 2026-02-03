package java_Package_String;

public class Alpha {
	
	public static void main(String[] args) {
		
		String name = "Tinks" ;
		char [] c = name.toCharArray() ;
		
		for(int i = 0; i<name.length(); i++)
		 {	
			boolean answer1 = Character.isAlphabetic(c[i]) ;

			System.out.println(answer1);
		 }
		
		
	}
	}




