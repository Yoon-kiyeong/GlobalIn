package com.listex;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("공각기동대");
		list1.add("원령공주");

		List<String> list2 = new ArrayList<String>(list1);
		list2.add("라퓨타");

		List<String> list3 = new ArrayList<String>();
		list3.addAll(list2);

		int n = list3.indexOf("원령공주");
		System.out.println(n);
		list3.add(n + 1, "코난");
		System.out.println(list3);

//		Iterator<String> it = list3.iterator();

		ListIterator<String> it = list3.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		while (it.hasPrevious()) {
			System.out.print(it.previous() + " ");
		}
		System.out.println();
	}
}
