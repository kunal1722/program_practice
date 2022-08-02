package practice;

import java.util.Scanner;

public class User_input_scanner_class {

	public static void main(String[] args) {
		//scanner class is present in java.util package 
		// and for this we have to import java.util.scanner
		
		Scanner s = new Scanner (System.in);   // in is inputstream
			System.out.println("enter name");	
            String name = s.next(); // for string next() is used
            System.out.println("enter age");
            int age = s.nextInt();    // for int nextint() is used
            System.out.println("enter mobile no");
            long mobile = s.nextLong();  // for long nextlong() is used
            System.out.println("enter gender");
           // String nextline = s.nextLine();
            String gender = s.next();
            System.out.println("enter gender");
            char male = s.next().charAt(0);
            System.out.println("above result is true or false");
            boolean result = s.nextBoolean();
            System.out.println("name :" + name);
            System.out.println("age :" + age);
            System.out.println("gender :" + gender);
            System.out.println("mobile ;" + mobile);
            System.out.println("male :" + male);
            System.out.println("result :" + result);
            
            
            // if in place of int i give string value or for any other data type i give any other 
            // data type value then it will show input mismatch exception
	}

}

