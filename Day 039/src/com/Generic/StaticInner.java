package com.Generic;

/*
 * static Ŭ����
 * 	- static Ŭ������ ��¿ �� ���� ���ǵǴ� ��찡 �ִµ� �װ��� �ٷ� Ŭ���� �ȿ� static ������ ������ ���� ��� ��¿�� ���� static���� �����ؾ� ��
 * 
 *  - ���� Ŭ������ ������ static�� ������
 *  - Ŭ���� ���ο��� static ������ ��� ���� ��
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
	// �ܺ� Ŭ������ ��� ���� ����
	int a = 10;
	private int b = 100;
	static int c = 200;

	static class Inner {
		// ���� Ŭ���� ����
		static int d = 1000;

		// ���� Ŭ������ ����� �� �ϳ��� static ����� ���� ���, static���� Ŭ������ ������ �־�� �Ѵ�.
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
		// static�̱� ������ ��ü�� ���� �������� �ʰ� �ٷ� ��밡��(StaticInner s = new StaticInner(); ���̵� ����)
	}
}
