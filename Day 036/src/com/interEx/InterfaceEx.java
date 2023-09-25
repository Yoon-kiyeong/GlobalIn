package com.interEx;

/*
 * 인터페이스는 단독으로 사용할 수 없으며 사용하기 위해서는 일반 클래스에서 구현력을 가져야 한다
 * 일반 클래스에서 implements 라는 예약어로 특정 인터페이스를 현재 클래스에서 구현하겠다고 암시하는 것이다.
 * 인터페이스가 가지는 추상 메소드들은 구현받은 클래스에서 반드시 전부 오버라이팅(재정의) 해야함

 */

public class InterfaceEx implements InterEx {

	@Override
	public int getA() {
		return A;
	}

	public static void main(String[] args) {
		InterfaceEx ie = new InterfaceEx();
		System.out.println("A : " + A);
	}

}
