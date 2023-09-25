package com.my;

public class AbsEx extends AbsEx02{
	public static void main(String[] args) {
		AbsEx ae =new AbsEx();
		System.out.println("ae.getA() " + ae.getA());
		System.out.println("ae.getStr() " + ae.getStr());
	}

	@Override
	public String getStr() { // AbsEx02 추상 클래스의 추상 메소드를 재정의한 것
		return str; 		 // str: AbsEx01 클래스의 멤버 변수
	}
}
