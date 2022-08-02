package practice;

import java.util.Arrays;

public class Second_largest_no_array {

	public static void main(String[] args) {
		int a [] = { 2, 6, 76, 85, 24};
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
	}

}
