package practice;

public class Palindrome_integer {

	public static void main(String[] args) {
		int i = 12121;
		int a = i;     // store number to a
		int rev = 0;   
		int rem;
		
		// get reverse of a and store it in variable
		while (a != 0) {
			rem = a % 10;
			rev = rev *10 + rem ;
			a = a / 10;
			}
		if ( i == rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		      //  or  //
		
		int v = 121;
		String s = String.valueOf(v);
		String y = "";
		for (int j = s.length()-1 ; j >= 0 ; j--) {
			y = y + s.charAt(j);
		}
		if (y.equals(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		

	}
}
