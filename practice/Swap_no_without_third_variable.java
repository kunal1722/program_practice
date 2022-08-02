package practice;

public class Swap_no_without_third_variable {

	public static void main(String[] args) {
		int a = 20;
		int b = 38;
		
		// with third variable c and storing it
		int c;
		c=a;
		a=b;
		b=c ;
		System.out.println( "a:" + a);
		System.out.println("b:"+ b);
		
// without any third variable
		int d = 40;
		int e = 50;
		e = d + e ;
		d = e - d;
		e = e - d;
		System.out.println("d:"+ d + "\n" + "e:"+ e);
	}

}
