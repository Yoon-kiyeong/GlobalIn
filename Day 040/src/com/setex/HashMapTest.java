package com.setex;

import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		// Map<Ű,��> => Ű�� �ߺ��� ������� �ʴ´�. Ű�� �ߺ��Ǵ� ���� ���ο� ������ ��ü��
		Map<String, String> map = new HashMap<>();
		map.put("��ȭ","�����޺� ŰŰ");
		map.put("ȣ��", "��ũ��");
		map.put("��ȭ", "Ȳȥ���� ��������");
		
		System.out.println(map);
		System.out.println();
		
		String key;
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));
		}
		map.put("��ȭ","�޸��� ����");
		System.out.println(map);
	}
}
