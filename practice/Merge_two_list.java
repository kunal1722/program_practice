package practice;

import java.util.ArrayList;
import java.util.List;

public class Merge_two_list {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("1");
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("2");
		list1.addAll(list2);
		System.out.println(list1);

		ArrayList<String> mergedList = new ArrayList<>(list1);
		mergedList.addAll(list2);
		System.out.println(mergedList);
  }

}
