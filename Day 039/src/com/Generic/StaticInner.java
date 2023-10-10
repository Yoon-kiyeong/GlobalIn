package com.Generic;

/*
 * static 클래스
 * 	- static 클래스로 어쩔 수 없이 정의되는 경우가 있는데 그것은 바로 클래스 안에 static 변수를 가지고 있을 경우 어쩔수 없이 static으로 선언해야 함
 * 
 *  - 내부 클래스의 지정로 static을 기재함
 *  - 클래스 내부에선 static 변수가 사용 가능 함
 *  
 *  Outer.Inner in - new Outer.Inner();
 *  
 *  class Outer {
 *  	static class Inner {
 *  	}
 *  }
 * 
 */
public class StaticInner {
	// 외부 클래스의 멤버 변수 선언
	int a = 10;
	private int b = 100;
	static int c = 200;

	static class Inner {
		// 내부 클래스 변수
		static int d = 1000;

		// 내부 클래스의 멤버들 중 하나라도 static 멤버가 있을 경우, static으로 클래스를 선언해 주어야 한다.
		public void printData() {
//			System.out.println("int a : " + a);
//			System.out.println("priavete int b : " + b);
			System.out.println("static int c : " + c);
			System.out.println("static int d : " + d);
		}
	}

	public static void main(String[] args) {
		StaticInner.Inner sin = new StaticInner.Inner();
		sin.printData();
		// static이기 때문에 객체를 따로 생성하지 않고도 바로 사용가능(StaticInner s = new StaticInner(); 없이도 가능)
	}
}
