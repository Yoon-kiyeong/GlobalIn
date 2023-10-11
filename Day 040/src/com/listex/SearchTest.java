package com.listex;

import java.util.*;

public class SearchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lists = new ArrayList<String>();
		lists.add("우리나라");
		lists.add("우산");
		lists.add("우리은행");
		lists.add("대한민국");
		lists.add("대한제국");
		lists.add("대한천하");
		lists.add("대구");
		lists.add("대형마트");
		lists.add("자바");
		lists.add("자연");
		System.out.println(lists);
		
		String str;
		System.out.print("검색할 단어 입력 >>");
		str = sc.next();
		
		ListIterator<String> it = lists.listIterator();
		
		while(it.hasNext()) {
			String temp = it.next();
			if(temp.startsWith(str)) {
				System.out.println(temp);
			} else {
				System.out.println("존재하지 않는 단어입니다.");
			}
		}
	}
}
