package practice;

public class Merge_two_array {

	public static void main(String[] args) {
		int a [] = { 12, 34 , 54 , 23, 5};
		int b [] = { 33, 65, 24 , 87 };
        int c [] = new int [a.length + b.length];
        int k = 0;
        for (int i = 0 ; i< a.length ; i++ , k++) {
        	c [k] = a[i];
        	 }
        for (int i = 0 ; i< b.length ; i++ , k++) {
        	c [k] = b[i];
        }
        for (int i = 0 ; i < c.length ; i++) {
        	System.out.println(c[i]);
        }
        
	}

}
