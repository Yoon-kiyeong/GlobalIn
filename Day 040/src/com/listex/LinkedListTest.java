package com.listex;

import java.util.*;

public class LinkedListTest {
	private static final String Colors1[] = { "Black", "Yellow", "Green", "Blue", "Orange", "YellowGreen" };
	private static final String Colors2[] = { "Green", "Red", "white", "Navy", "Purple" };

	public LinkedListTest() {
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();

		for (String color : Colors1) // Colors1�� ������ �߰�
			list1.add(color);

		for (String color : Colors2) // Colors2�� ������ �߰�
			list2.add(color);

		list1.addAll(list2);
		list2 = null;

		// �ڷ� ���
		printList(list1); // printList �޼ҵ� ȣ��

		// �ڷ� ����
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

	// �ڷ� ����
	public static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}

	// ���� ���
	public static void printReversedList(List<String> list) {
		ListIterator<String> it = list.listIterator(list.size());	//List�� ����� �˾ƾ� �׸�ŭ ����� �� �� �ֱ⿡, .size() �޼ҵ带 ����ؾ� ��

		System.out.print("���� ��� : ");
		while (it.hasPrevious()) {
			System.out.printf("%s ", it.previous());
		}
	}

	public static void main(String[] args) {
		new LinkedListTest();
	}
}
