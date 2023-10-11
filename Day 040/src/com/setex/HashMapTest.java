package com.setex;

import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		// Map<키,값> => 키는 중복을 허용하지 않는다. 키가 중복되는 경우는 새로운 값으로 대체됨
		Map<String, String> map = new HashMap<>();
		map.put("만화","마녀배달부 키키");
		map.put("호러", "스크림");
		map.put("영화", "황혼에서 새벽까지");
		
		System.out.println(map);
		System.out.println();
		
		String key;
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));
		}
		map.put("영화","달마야 놀자");
		System.out.println(map);
	}
}
