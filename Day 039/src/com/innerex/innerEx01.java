package com.innerex;

/*
 * 1. inner클래스 : 내부 클래스 : 중첩 클래스
 * - 특정 클래스 내에 또 다른 클래스가 정의되는 것을 의미한다.
 * 내부 클래스가 필요한 이유
 * 	- 독립적이지만 하나의 멤버처럼 사용할 수 있기 때문
 * - 내부 클래스 정의 시 주의사항
 * 	- 내부 클래스는 외부 클래스의 모든 멤버들을 마치 자신의 멤버처럼 사용할 수 있다.
 * 	- static 내부 클래스를 제외하고는 다른 내부 클래스는 항상 외부 클래스를 통해야 객체를 생성할 수 있다.
 * 
 * 내부 클래스의 종류
 * 	1. 멤버 클래스
 * 	2. static 클래스
 * 	3. 로컬 클래스
 * 	4. 익명 클래스
 * 
 * 	1. 멤버 클래스
 * 	 - 객체를 생성해야만 사용할 수 있는 멤버들과 같은 위치에 정의되는 클래스
 * 	 - 외부 클래스의 객체를 생성한 후 생성할 수 있다.
 * 
 * 	멤버 클래스 내부에는 static이 존재할 수 없다.
 * 	객체 생성
 * 		-Outer.Inner in = new Outer().new Inner();
 * 
 *  class Outer {
 *  	class Inner{
 *  	}
 *  }
 */

class OuterEx {	//외부 클래스
	class InnerEx {	//내부 클래스
		int x = 5;
	}
}

public class innerEx01 {
	public static void main(String[] args) {
		// 외부 클래스 객체인지 생성
		OuterEx oe = new OuterEx();
		// 외부 클래스 객체를 통해서 내부 클래스 객체를 생성함
		OuterEx.InnerEx oi = oe.new InnerEx();
		// 내부 클래스의 멤버에 접근하려면 외부 클래스의 객체를 먼저 생성하고 내부 클래스 객체를 생성한 후 내부 클래스의 멤버에 접근할 수 있다.
		System.out.println("oi.x : " + oi.x);
	}
}
