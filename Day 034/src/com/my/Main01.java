package com.my;

/*
 * 상속(Inheritance)
 * 새롭게 생성된 클래스가 이미 존재하는 클래스가 다른 클래스ㅢ 기능와 중복되는 경우
 * 이미 존재하는 클래스의 일부분이나 전체 구조를 공유할 수 있도록 하는 기능을 의미함
 * 
 * 즉, 상속은 객체를 좀 더 쉽게 만들 수 있는 고수준의 재 사용을 확보하고 클래스 간의 관계를 구성함으로써 객체지향의 또 다른 특징인 다형성 문법의 토대가 된다
 */

class SuperEx01 { // 부모클래스, Super 클래스, Base 클래스(기본 클래스)
	// 부모클래스(Parent), Super 클래스, Base 클래스(기본 클래스)
	// ~ 상속을 주기 위한 준비 클래스

	protected double area;
	// protected : 하위 클래스, 동일 패키지 내에서만 접근이 가능하다
	// privated : 하위 클래스에서도 접근 불가(오로지 클래스 내에서만 접근이 가능)

	public SuperEx01() { // 부모 생성자
		System.out.println("Super Class: ...........");
	}

	// 인스턴스 메소드
	public void write(String title) {
		System.out.println(title + area);
	}
}

// 자바는 다중상속을 지원하지 않는다
// 자바는 단일상속만을 지원한다.
class InherEx01 extends SuperEx01 {
	// 자식 클래스(Child), Sub 클래스, Derivation 클래스(유도 클래스)
	// - 상속을 받아 새롭게 만드는 클래스

	public InherEx01() {
		System.out.println("InherEx01 생성자(sub class.....");
	}

	public void circle() {
		int r = 10;
		super.area = (double) (r * r * 3.14);
		write("원의 넓이 : ");
	}

	public void rect() {
		int w = 20;
		int h = 15;
		area = (double) (w * h);
		write("사각형의 넓이 : ");

	}
}

public class Main01 extends SuperEx01 { // 자식 클래스, Sub 클래스, Dervition 클래스(유도 클래스)
	public static void main(String[] args) {
		InherEx01 ie = new InherEx01();
		ie.circle();
		ie.rect();
	}
}
