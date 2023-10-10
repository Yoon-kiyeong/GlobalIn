package com.innerex;

public class MemberInner {
	int a = 10;	// �ν��Ͻ� ��� ����
	private int b = 100;
	static int c = 200;
	
	//���� Ŭ���� ����
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
