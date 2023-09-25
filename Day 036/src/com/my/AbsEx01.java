package com.my;

public abstract class AbsEx01 {
	// 멤버 변수 : 상수, 일반 변수, 일반 메소드, 추상 메소드 (반드시 하나는 선언해야 함)
	int a = 100; // 일반 변수
	final String str = "나는 자바를 무지하게 사랑합니다"; // final이 선언 되었으므로 절대 변하지 않음
	
	public String getStr() { // 일반 메소드
		return str;
	}
	
	//추상 메소드는 몸체가 없다.
	abstract public int getA();	// 추상 메소드
	// {}(블레이스)가 없기 때문에 ();로 끝남
	
}
