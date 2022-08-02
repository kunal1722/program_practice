package practice;

public class Remove_spaces_from_string {

	public static void main(String[] args) {
		String s = "my name is kunal";
		String y[] = s.split(" ");
		for(int i = 0 ; i<= y.length-1 ; i++) {
			System.out.print(y[i]);
		}
		System.out.println();
		for(int i = y.length-1 ; i >= 0 ; i--) {
			System.out.print(y[i] + " ");
		}
	}

}
