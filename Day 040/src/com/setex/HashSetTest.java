package com.setex;

import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> dog = new HashSet<>();
		dog.add("������");
		dog.add("�ð��ں���");
		dog.add("����");
		System.out.print("���� ������ set : ");
		System.out.println(dog);
		
		Iterator<String> it = dog.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
//		dog.add("������");
		dog.add("���޶�Ͼ�");
		System.out.println(dog);	// �ߺ��� �����ʹ� �߰��� �� ����
	}
}
