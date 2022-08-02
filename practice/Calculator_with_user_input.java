package practice;

import java.util.Scanner;

public class Calculator_with_user_input {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first no.");
		int first_no = s.nextInt();
		System.out.println("enter second no.");
		int second_no = s.nextInt();
		System.out.println("enter symbol : + , - , * , / , %");
		String symbol = s.next();
		int result;
		
		switch(symbol) {
		case "+" : result = first_no + second_no;
		System.out.println(result);
		break;
		case "-" : result = first_no - second_no;
		System.out.println(result);
		break;
		case "/" : result = first_no / second_no;
		System.out.println(result);
		break;
		case "%" : result = first_no % second_no;
		System.out.println(result);
		break;
		default :System.out.println("invalid symbol");
		break;
		}
		System.out.println("--------------------------");
		System.out.println("addition :" + (first_no + second_no));
		System.out.println("subtraction :" + (first_no - second_no));
		System.out.println("multiplication :" + (first_no * second_no));
		System.out.println("division :" + (first_no / second_no));
		

	}

}
