package com.innerex;

/*
 * Local 내부 클래스
 * 로컬 내부 클래스는 특정 메소드 안에서 정의되는 클래스를 의미한다.
 * 틀정 메소드 안에서 선언되는 지역변수와 같은 외미이다.
 * 
 * 메소드가 호출될 때 생성할 수 있으며 메소드의 호출이 끝나면 지역변수와 같이 자동으로 소멸된다.
 * 
 * 잘 사용되지 않는다.
 * 
 * class Outer {
 * 	public void methodA() {
 * 		class Inner {
 * 		}
 * 	}
 * }
 * 
 * 
 */

public class LocalInner {
	int a = 100;	// 인스턴스 멤버 변수
	public void InnerTest(int k) {	// 인스턴스 멤버 메소드
		int b = 200; // 지역변수
		final int c = k;
		
		class Inner {	//지역 클래스
			public void getData() {
				System.out.println("int a : " + a);
				System.out.println("int b : " + b);
				System.out.println("final int c : " + c);
			} // end Inner
		} // 메소드 내에 있는 로컬 클래스 객체 생성
		// 생성된 객체를 통해서 메소드 호출
		Inner i = new Inner();
		i.getData();
	} // end InnerTest
	public static void main(String[] args) {
		LocalInner l = new LocalInner();
		l.InnerTest(1000);
	}
}
