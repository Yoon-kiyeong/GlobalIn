package com.setex;

import java.util.*;

public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("홍길동", 90);
		map.put("이순신", 100);
		map.put("이기자", 60);
		map.put("자바다", 100);
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set1.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		// 키 출력
		Set set2 = map.keySet();
		System.out.println("이름 : " + set2);
	
		// 값 출력
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		while(it2.hasNext()) {
			Integer i = it2.next();
			sum += i;
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)sum / set2.size());
		System.out.println("최고점수 : " + Collections.max(v));
		System.out.println("최저점수 : " + Collections.min(v));
	}
}
