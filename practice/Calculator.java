package practice;

public class Calculator {

	public static void main(String[] args) {
		
		// we will use switch case
		
		int a = 889;
		int b = 78;
		int result;
		String symbol = "/";
	    switch (symbol) 
	    {
	    case "+" : result = a+ b;
	    System.out.println(result);
	    break;    // if we will not use break then it will print all result
	    case "-" : result = a-b;
	    System.out.println(result);
	    break;
	    case "*" : result = a * b;
	    System.out.println(result);
	    break;
	    case "/" : result = a / b;  // show quotient
	    System.out.println(result);
	    break;
	    case "%" : result = a % b;  // show remainder
	    System.out.println(result);
	    break;
	    }
	}
}
