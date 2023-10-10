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
	
	System.out.println("첫번째 요소 : " + v.firstElement());
	System.out.println("두번째 요소 : " + v.get(1));
	System.out.println("마지막 요소 : " + v.lastElement());
	
	//검정색을 흰색으로 변경
	v.set(0, "white");
	System.out.println("첫번째 요소 : " + v.firstElement());
	System.out.println("요소의 개수 : " + v.size());
	
	//첫번쨰 요소에 빨강 추가
	v.insertElementAt("Red", 0);
	System.out.println("첫번째 요소 : " + v.firstElement());
	System.out.println("요소의 개수 : " + v.size());
	
	//전체 출력
	for(String str : v)
		System.out.print(str + " ");
	
	//검색
	int idx = Collections.binarySearch(v, "YellowGreen");
	// 오름차순 정렬된 제료에서만 사용 가능함
	System.out.println("\n 연두 : " + idx + "에 위치");
	// 검색 데이터가 존재하지 않을 경우 음수 출력
	
	//내림차순 정렬
	Collections.sort(v,null);
	//내림차순 정렬 후 출력
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		
	idx = Collections.binarySearch(v, "YellowGreen", Collections.reverseOrder());
	System.out.println("\n 연두 : " + idx + "에 위치");
	}
}
