package com.setex;

import java.util.*;

public class HashTableTest {
	private static final String name[] = { "이순신", "홍길동", "이길자", "저팔계", "심심해", "홍길동" };
	private static final String tel[] = { "111-1111", "222-2222", "333-3333", "444-4444", "555-5555", "666-6666" };

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();

		// 해시 테이블에 키, 데이터 입력
		for (int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);

			// 해시 테이블의 값을 키값을 이용하여 검색
			String str = ht.get("이길자");
			if (str != null) {
				System.out.println("이길자의 전화번호는 " + str + "입니다");
			}

			// 키 값이 존재하는지 검색
			if(ht.containsKey("심심해")) {
				System.out.println("심심해 값이 존재합니다");
			}
			
			// 데이터 값이 존재하는지 검색
			if(ht.containsValue("333-3333")) {
				System.out.println("333-3333 값이 존재합니다");
			}
			
			// 키값 삭제
			ht.remove("홍길동");
			if(ht.containsKey("홍길동")) {
				System.out.println("홍길동 자료가 존재합니다");
			} else {
				System.out.println("홍길동 자료가 존재하지 않습니다.");
			}
		}
	}
}
