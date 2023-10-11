package com.setex;

import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> dog = new HashSet<>();
		dog.add("진돗개");
		dog.add("시고르자브종");
		dog.add("시츄");
		System.out.print("기존 데이터 set : ");
		System.out.println(dog);
		
		Iterator<String> it = dog.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
//		dog.add("진돗개");
		dog.add("포메라니안");
		System.out.println(dog);	// 중복된 데이터는 추가할 수 없음
	}
}
