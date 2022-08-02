package practice;

public class Two_Array_conatins_same_element {

	public static void main(String[] args) {
		int [] a = { 2, 4 ,7 ,8, 8};
		int [] b = { 1, 2, 7, 8, 9 , 8 , 4};
		for (int i = 0 ; i < a.length-1 ; i++) {
			for(int j = 0 ; j<= b.length-1; j++) {
				if ( a[i] == b[j]) {
					System.out.println(b[j]);
				}
				
			}
		}

	}

}
