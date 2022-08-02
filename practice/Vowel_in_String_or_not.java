package practice;

import java.util.Arrays;

public class Vowel_in_String_or_not {

	public static void main(String[] args) {
		String s = "qwertyuiopasdfghjklzxcvbnm";
		char a [] = s.toCharArray();
         Arrays.sort(a);
         System.out.println(a);
         for (int i = 0 ;i<s.length(); i++) {
        	 if (s.charAt(i) == 'a' || s.charAt(i)== 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o'|| s.charAt(i) == 'u')  {
        		 System.out.println("contains vowel :" + s.charAt(i) + "  at index :" + i );
        		  }
        	 else {
        		 }
         }

	}
}

