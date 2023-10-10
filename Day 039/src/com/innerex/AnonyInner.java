package com.innerex;

/* AnonyMous(익명) 내부 클래스
 * 익명 클래스
 * 
 * 익명이란? -> 이름이 없는 것을 의미함 -> 정의된 클래스의 이름이 없다는 것을 의미함
 * - Event와 관련이 있음
 * - Interface 구현이 필요가 없다
 * - 일반 메소드 내부에서 정의부를 가질 수 있다.
 * - abstract 클래스를 상속 받을 수 있다.
 * - 반드시 final로 선언 해야한다.
 * - implements를 할 때에는 한개만 implements 한다.
 * 
 * 형식
 * 
 * class Outer {
 * 	Inner inner = new Inner() {
 *  };
 * public void method() { // 일반 멤버 메소드
 * 	}
 * }
 * 
 */

abstract class TestAbst {
	int data = 1000;

	public abstract void printData();// 추상 메소드
}

public class AnonyInner {
	TestAbst in = new TestAbst() {
		@Override
		public void printData() {
			System.out.println("data : " + data);
		}
	};

	public static void main(String[] args) {
		AnonyInner ai = new AnonyInner();
		ai.in.printData();
	}
}
