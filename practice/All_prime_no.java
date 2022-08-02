package practice;

public class All_prime_no {

	public static void main(String[] args) {
		int b= 0;
		for (int i = 1 ; i<=100 ; i++) {
			for (int j = 2 ; j <= i-1 ; j++) {
				if (i % j == 0) {
					b = b + 1;
				}
			}
				if (b == 0) {
					System.out.println(i);
				}
				else {
					b = 0;
				}
				
			}
	}
}
		

	


