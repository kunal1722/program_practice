package practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println(ll);
		
		LinkedList<Integer> ll1 = new LinkedList<>();

		ll.descendingIterator().forEachRemaining(ll1::add);

		System.out.println(ll1);
		
		ArrayList<Integer> l2 = new ArrayList<>();

		l2.add(1);
		l2.add(2);
		l2.add(3);
		System.out.println(l2);
		ArrayList<Integer> ll2 = new ArrayList<>();

		ll.descendingIterator().forEachRemaining(ll2::add);

		System.out.println(ll2);
	}
	

}
