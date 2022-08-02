package practice;

public class Palindrome_string {

	public static void main(String[] args) {
		String s = "radara";
		String y = "";
	    for(int i = s.length()-1 ; i >= 0; i--) {
	    	System.out.println(s.charAt(i));
	    	y = y + s.charAt(i);
	      }
	    if (s.equals(y)) {
	    	System.out.println("palindrome");
	    }
	    else {
	    	System.out.println("not palindrome");
	    }
	    
	
	
	
	
	
	
	
	
	
	
	}

}
