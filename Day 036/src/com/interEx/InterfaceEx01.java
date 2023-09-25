package com.interEx;

interface Demo {
	public static final double PI = 3.14;
	//인터페이스의 멤버 변수는 static final을 붙이지 않아도 컴파일러가 자동으로 알아서 static final을 붙여준다.
	public int a = 10; //상수
	
	public void print(); // 추상 메소드
}

class DemoImpl implements Demo {

	public void write() { //일반 메소드 -> Demoimpl은 클래스이기 때문에 일반 메소드 작성이 가능
		//클래스에 정의 된 일반 메소드
		System.out.println("클래스에 정의 된 일반 메소드");
		
	}
	
	@Override
	public void print() { 
		System.out.println("인터페이스의 메소드를 재정의");
	}
	
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		// 인터페이스의 객체는 상위 객체를 이용하여 생성함
		Demo dm = new DemoImpl(); // 얍 캐스팅
		
		dm.print();
//		dm.write(); // 컴파일 에러
		((DemoImpl)dm).write();	//다운 캐스팅
		
		System.out.println(Demo.PI);
		System.out.println(Demo.a);
	}
}
