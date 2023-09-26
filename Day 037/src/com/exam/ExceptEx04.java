package com.exam;

/*
 * 문자열을 정수로 변환할 때 발생하는 NumberFormatException을 처리하는 프로그램을 구현하시오
 * 
 * String[] stringNumber = {"23","222","3.141592"};
 * 
 * 결과
 * 정수로 변환된 값 : 23
 * 정수로 변환된 값 : 222
 * 3.141592는 정수로 변환 할 수 없습니다.
 */

public class ExceptEx04 {
	public static void main(String[] args) {
		String[] StringNumber = { "23", "222", "3.141592" };
		for (int i = 0; i < StringNumber.length; i++) {
			try {
				System.out.println("정수로 변환된 값 : " + Integer.parseInt(StringNumber[i]));
			} catch (NumberFormatException ne) {
				System.out.println(StringNumber[i] + "는 정수로 변환할 수 없습니다");
			}
		}
	}
}