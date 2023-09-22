package com.my;
/*
 * super
 * - 부모 객체의 레퍼런스
 * - 부모 클래스의 멤버와 자손 클래스의 멤버가 중복정의 되어 새로 구별해야 하는 경우에만 super를 사용하는 것이다.
 * 
 * 
 * super() : 상속에서의 생성자
 * - 자식의 기본 생성자에는 super()가 생략되어 있음
 * - 겍체 생성 시 무조건 부모 클래스로부터 생성됨
 * - 즉, 부모와 생성자를 무조건 먼저 호출해야함
 * - this(), super()는생성된 가장 윙 ㅔ명시해야함
 */

class Super {
	int a = 5;

	public Super() {
	}

	public Super(int x) {
		System.out.println("부모 클래스의 생성자 : " + x);
	}
}

class Sub extends Super {

	int a = 10;
	
	public Sub() {
		super(5);	// 매개변수를 가지고 있는 부모의 생성자를 의미함
		System.out.println("자식 클래스의 생성자 : " + a);
	}

	public void test() {
		System.out.println(this.a); // Sub 클래스의 a가 출력됨
		System.out.println(super.a); // 부모 클래스인 Super 클래스의 a가 출력됨
	}
}

public class Main02 {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.test();
	}
}
