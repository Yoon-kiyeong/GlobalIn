package com.listex;

import java.util.*;

public class SearchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lists = new ArrayList<String>();
		lists.add("�츮����");
		lists.add("���");
		lists.add("�츮����");
		lists.add("���ѹα�");
		lists.add("��������");
		lists.add("����õ��");
		lists.add("�뱸");
		lists.add("������Ʈ");
		lists.add("�ڹ�");
		lists.add("�ڿ�");
		System.out.println(lists);
		
		String str;
		System.out.print("�˻��� �ܾ� �Է� >>");
		str = sc.next();
		
		ListIterator<String> it = lists.listIterator();
		
		while(it.hasNext()) {
			String temp = it.next();
			if(temp.startsWith(str)) {
				System.out.println(temp);
			} else {
				System.out.println("�������� �ʴ� �ܾ��Դϴ�.");
			}
		}
	}
}
