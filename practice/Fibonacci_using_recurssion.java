package practice;

public class Fibonacci_using_recurssion {
	
	// with recursion
	public static int fibonacci (int d) {
		if (d <= 1) 
		return d;
		return  fibonacci (d-1) + fibonacci(d-2) ;
}
	
	public static void main(String[] args) {
		
		int d =13;
		System.out.println(fibonacci (d));
		
	
		//without recursion
		
		int a = 1 ; 
		int b = 2 ; 
		int c;
		
     for (int i = 0 ; i<=20 ; i++) {
    	 c = a + b;
    	 a = b;
    	 b = c;
    	 System.out.println(c);
     }
     
     
    int l = 2;
     int m = 3;
     int n; 
     for(int j = 0 ; j<= 10; j++)
     {  
    	 n = l + m;
    	 l = m ;
    	 m = n;
    	 System.out.println(n);
     }
     
     
	}

}
