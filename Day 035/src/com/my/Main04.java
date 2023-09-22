package com.my;

/*
 * 다형성
 * 
 * - 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 하는 것을 의미함
 * - 부모 클래스 타입의 참조변수로 자식 클래스의 인스턴스를 참조할 수 있도록 한다.
 * - 부모 클래스 = 자식
 * 
 * 기존 선언 및 객체(인스턴스) 생성
 * 
 * Super super = new Super();
 * Sub sub = new Sub();
 * 
 * 다형성 선언 및 객체 생성
 * Super s = new Sub();
 * 
 * Super
 * Sub1, Sub2, Sub3(자식들);
 * Super s1 = new Super();
 * Super s2 = new Super();
 * Super s3 = new Super();
 * 
 * 다형성
 * Super s1 = new Sub1();
 * Super s2 = new Sub2();
 * Super s3 = new Sub3();
 * 
 * - 다형성에서 메소드는 자식 메소드를 호출한다
 * 다형성에서 멤버 필드는 부모의 것을 사용한다.
 */

class ParentEx {
	int foo = 5;

	public int getNumber(int a) {
		return a + 1;
	}
}

public class Main04 extends ParentEx {
	int foo = 7;

	@Override
	public int getNumber(int a) {
		return a + 2;
	}

	public static void main(String[] args) {
		//다형성
		ParentEx pe = new ParentEx();
		ParentEx pe1 = new Main04();
		System.out.println(pe.getNumber(2));	//부모 메소드 호출
		System.out.println(pe1.getNumber(5));	//자식 메소드 호출
		System.out.println(pe.foo);
		System.out.println(pe1.foo);
		
	}
}
