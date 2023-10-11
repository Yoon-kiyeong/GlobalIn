package com.listex;

import java.util.*;

public class LinkedListTest {
	private static final String Colors1[] = { "Black", "Yellow", "Green", "Blue", "Orange", "YellowGreen" };
	private static final String Colors2[] = { "Green", "Red", "white", "Navy", "Purple" };

	public LinkedListTest() {
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();

		for (String color : Colors1) // Colors1에 데이터 추가
			list1.add(color);

		for (String color : Colors2) // Colors2에 데이터 추가
			list2.add(color);

		list1.addAll(list2);
		list2 = null;

		// 자료 출력
		printList(list1); // printList 메소드 호출

		// 자료 제거
		removeItems(list1, 4, 7);
		printList(list1);

		printReversedList(list1);
	}

	public void printList(List<String> list) {
		System.out.print(""
				+ "list : ");

		for (String color : list)
			System.out.printf("%s ", color);

		System.out.println();
	}

	// 자료 제거
	public static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}

	// 역순 출력
	public static void printReversedList(List<String> list) {
		ListIterator<String> it = list.listIterator(list.size());	//List의 사이즈를 알아야 그만큼 출력을 할 수 있기에, .size() 메소드를 사용해야 함

		System.out.print("역순 출력 : ");
		while (it.hasPrevious()) {
			System.out.printf("%s ", it.previous());
		}
	}

	public static void main(String[] args) {
		new LinkedListTest();
	}
}
