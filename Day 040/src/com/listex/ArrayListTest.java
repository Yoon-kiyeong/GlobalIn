package com.listex;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("�����⵿��");
		list1.add("���ɰ���");

		List<String> list2 = new ArrayList<String>(list1);
		list2.add("��ǻŸ");

		List<String> list3 = new ArrayList<String>();
		list3.addAll(list2);

		int n = list3.indexOf("���ɰ���");
		System.out.println(n);
		list3.add(n + 1, "�ڳ�");
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
