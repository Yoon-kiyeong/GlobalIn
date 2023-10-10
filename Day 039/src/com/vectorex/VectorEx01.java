package com.vectorex;

/*
 * 벡터 (Vector)
 * 배열과 비슷하지만, 배열과는 달리 다른 종류의 데이터 형을 가진 데이터 요소를 가질 수 있다.
 * 데이터가 가득차면 자동으로 크기를 증가시킨다.
 * 
 * 벡터의 기본 크기 : 10
 * 11 - 20 40 80 160 320 640
 * 
 */

import java.util.*;

public class VectorEx01 {

	private static final String[] Colors = { "Black", "Yellow", "Green", "Blue", "Red", "YellowGreen" };
	
	public static void main(String[] args) {
		int i;
		String str;
		
		//벡터 인스턴스 생성
		Vector<Object> v = new Vector<>();
		
		//벡터에 데이터 저장
		//add()
		for(i = 0 ; i < Colors.length; i++) {
			v.add(Colors[i]);
		}
		
		str = (String)v.firstElement();
		System.out.println("첫번쨰 요소 : " + str);
		
		str = (String)v.lastElement();
		System.out.println("마지막 요소 : " + str);
		
		/*
		 * Iterator : 이터레이터를 통해서 전체 자료를 출력
		 * 
		 * hasNext() : 다음 데이터가 존재하는지 여부를 반영
		 * next() : 다음 데이터 요소를 직접 반환함
		 * 
		 * Iterator it = v.iterator();
		 * 
		 */
		
		Iterator it = v.iterator();
		while(it.hasNext()) {
			str = (String)it.next();
			System.out.print(str + " ");
		}
	}
}
