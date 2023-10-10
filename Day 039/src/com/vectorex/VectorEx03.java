package com.vectorex;

/*
 * 
 * 
 */

import java.util.*;

public class VectorEx03 {

	private static final String[] Colors = { "Black", "Yellow", "Green", "Blue", "Red", "YellowGreen" };
	
	public static void main(String[] args) {

	Vector<String> v = new Vector<String>();
	for(String str : Colors)
		v.add(str);
	
	System.out.println("ù��° ��� : " + v.firstElement());
	System.out.println("�ι�° ��� : " + v.get(1));
	System.out.println("������ ��� : " + v.lastElement());
	
	//�������� ������� ����
	v.set(0, "white");
	System.out.println("ù��° ��� : " + v.firstElement());
	System.out.println("����� ���� : " + v.size());
	
	//ù���� ��ҿ� ���� �߰�
	v.insertElementAt("Red", 0);
	System.out.println("ù��° ��� : " + v.firstElement());
	System.out.println("����� ���� : " + v.size());
	
	//��ü ���
	for(String str : v)
		System.out.print(str + " ");
	
	//�˻�
	int idx = Collections.binarySearch(v, "YellowGreen");
	// �������� ���ĵ� ���ῡ���� ��� ������
	System.out.println("\n ���� : " + idx + "�� ��ġ");
	// �˻� �����Ͱ� �������� ���� ��� ���� ���
	
	//�������� ����
	Collections.sort(v,null);
	//�������� ���� �� ���
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		
	idx = Collections.binarySearch(v, "YellowGreen", Collections.reverseOrder());
	System.out.println("\n ���� : " + idx + "�� ��ġ");
	}
}
