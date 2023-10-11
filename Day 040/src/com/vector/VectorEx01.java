package com.vector;

import java.util.*;

public class VectorEx01 {

	private static final String[] Colors = { "Black", "Yellow", "Green", "Blue", "Red", "YellowGreen" };

	public static void main(String[] args) {

		// 벡터 인스턴스 생성
		Vector<String> v = new Vector<String>();
		System.out.println(v.size()); // for문 뒤에 넣을 경우, 벡터 안에 Colors의 데이터가 들어가기 전이기 때문에 0으로 출력 됨
		for (String str : Colors)
			v.add(str);

		System.out.println(v.size()); // for문을 통해, 벡터 안에 Colors의 데이터를 넣었기 때문에 Colors의 크기 만큼 출력이 됨

		System.out.println("전체출력 ");
		for (String str : Colors)
			System.out.print(str + " ");
		System.out.println();

		// 검색
		String s = "Yellow";
		if (v.contains(s)) {
			int i = v.indexOf(s) + 1;
			System.out.println(s + " -> 위치 : " + i);
		}

		// 삭제
		v.remove(0); // 인덱스를 이용하여 삭제하는 방법 //0번째 데이터를 삭제
		v.remove("Green"); // 벡터 안의 데이터를 입력하여 삭제하는 방법
		System.out.println("삭제 후 ");
		for (String str : v)		// Colors가 아닌 v로 지정해야 삭제가 됨
			System.out.print(str + " ");
		System.out.println();
	}
}
