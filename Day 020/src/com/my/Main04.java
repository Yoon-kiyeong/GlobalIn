package com.my;

/* 문)
 * 상수 PI를 선언하고 원의 면적을 구하는 프록램을 구현하시오
 * 원의 넓이 : 반지름 * 반지름 * PI
*/

public class Main04 {
	public static void main(String[] args) {
		final double PI = 3.14; // 원주율ㅇ르 상수로 선언
		// 원의 반지름을 저장할 변수
		double r = 10;
		
		double result = (r * r) * PI;
		System.out.println((int)result);
		System.out.println(result);
	}
}
