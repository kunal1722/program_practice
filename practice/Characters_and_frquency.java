package practice;

import java.util.HashMap;
import java.util.Map;

public class Characters_and_frquency {

	public static void main(String[] args) {
		String s = "abcdABCDabcd";

		char[] ch = s.toCharArray();

		Map<Character, Integer> frequency = new HashMap<>();

		for(char c : ch) {
			if(frequency.containsKey(c)) {
				frequency.put(c, frequency.get(c)+1);
			}
			else
				frequency.put(c, 1);
		}
		System.out.println(frequency);
    
	
	
	String d = new String ("ggjstdvdghdn");
	char h [] = d.toCharArray();
	Map <Character , Integer> m = new HashMap<>();
	for (char e : h) {
		if (m.containsKey(e)) {
			m.put(e, m.get(e)+1);
		}
		else {
			m.put(e, 1);
		}
	}
		System.out.println(m);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
