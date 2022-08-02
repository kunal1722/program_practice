package practice;

public class Leap_year {

	public static void main(String[] args) {
		  // leap year should be divisible by 400
		//                or
		 //  leap year should be divisible by 4 and should not be divisible by 100
		
		
		int a = 2020;
		if (a % 400 == 0 || (a % 4 == 0 & a % 100 != 0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
		
		
		
		
		
		
	}

}
