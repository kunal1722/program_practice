package practice;

public class Shuffle_array {

	public static void main(String[] args) {
		int a []= { 2, 5, 87, 34 };
		int b []= { 3, 7, 33 , 23};
		int c = 0;
		for (int i = 0 ; i<=a.length-1 ; i++) {
				c = a[i];
				a[i] = b[i];
				b[i] = c;
				System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int j =0 ; j<=b.length-1 ;j ++) {
			System.out.print(b[j] + " ");

	}

}
}
