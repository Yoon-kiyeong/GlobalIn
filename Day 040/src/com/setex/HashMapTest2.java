package com.setex;

import java.util.*;

public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("ȫ�浿", 90);
		map.put("�̼���", 100);
		map.put("�̱���", 60);
		map.put("�ڹٴ�", 100);
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set1.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}
		
		// Ű ���
		Set set2 = map.keySet();
		System.out.println("�̸� : " + set2);
	
		// �� ���
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		while(it2.hasNext()) {
			Integer i = it2.next();
			sum += i;
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (float)sum / set2.size());
		System.out.println("�ְ����� : " + Collections.max(v));
		System.out.println("�������� : " + Collections.min(v));
	}
}
