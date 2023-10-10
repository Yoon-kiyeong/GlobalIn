package com.Generic;

/*
 * 열거형(Enum)
 * 
 * 정의 : 정수를 자동적으로 증가하여 상수들을 만들어 쓰이는 열거형이다
 * 		자바에서의 열거형은 상수를 하나의 객체로 인식하고 여러개의 상수객체들을 한 곳에 모아둔 하나의 객체라고 할 수 있다.
 * 형식
 * 	[접근제한자] enum [열거형이름] {
 * 	상수1, 상수2, 상수3, ...
 * }
 * 
 */
public class EnumEx01 {
	public enum Lesson {
		JAVA, XML, JSP, Spring
	}

	public static void main(String[] args) {
		Lesson l = Lesson.JSP;
		System.out.println(l);
		System.out.println(Lesson.Spring);
	}
}
