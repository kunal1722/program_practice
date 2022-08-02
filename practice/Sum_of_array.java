package practice;

public class Sum_of_array {

	public static void main(String[] args) {
		int [] a= { 2, 8, 9, 1 , 8};
		int b = 0;
		for(int i = 0 ; i <= a.length-1 ; i++) {
			b = b + a[i];
			
		}
		System.out.println(b);

	}

}
