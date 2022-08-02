package practice;

public class reverse_string {

	public static void main(String[] args) {
		String a = "kunal";
		String b= "";
		for (int i= a.length()-1 ; i>= 0 ; i--) {
		//System.out.print(a.charAt(i));
		b = b + a.charAt(i);
	}
		System.out.println(b);
		
	}

}
