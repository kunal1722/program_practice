package practice;

import java.util.Arrays;

public class Remove_repeated_char_from_String {

	public static void main(String[] args) {
		String s = "lovemyindial";
		char a [] = s.toCharArray();
		Arrays.sort(a);
		for (int i = 0 ; i <a.length-1 ; i++) {
			for(int j = 0 ; j < i ; j++) {
				if ( a[i] == a[j]) {
					System.out.println(a[i]);
					break;
					}
				
			}
		}
	}

}
