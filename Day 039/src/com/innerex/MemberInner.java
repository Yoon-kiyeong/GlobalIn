package com.innerex;

public class MemberInner {
	int a = 10;	// 인스턴스 멤버 변수
	private int b = 100;
	static int c = 200;
	
	//내부 클래스 정의
	class Inner {
		public void printData() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
		}
	}

	public static void main(String[] args) {
		MemberInner mi = new MemberInner();
		MemberInner.Inner inn = mi.new Inner();
		
		//MemberInner.Inner inn = new MemberInner().new Inner();
		inn.printData();
	}
}
