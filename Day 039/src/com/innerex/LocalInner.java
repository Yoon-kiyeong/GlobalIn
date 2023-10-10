package com.innerex;

/*
 * Local ���� Ŭ����
 * ���� ���� Ŭ������ Ư�� �޼ҵ� �ȿ��� ���ǵǴ� Ŭ������ �ǹ��Ѵ�.
 * Ʋ�� �޼ҵ� �ȿ��� ����Ǵ� ���������� ���� �ܹ��̴�.
 * 
 * �޼ҵ尡 ȣ��� �� ������ �� ������ �޼ҵ��� ȣ���� ������ ���������� ���� �ڵ����� �Ҹ�ȴ�.
 * 
 * �� ������ �ʴ´�.
 * 
 * class Outer {
 * 	public void methodA() {
 * 		class Inner {
 * 		}
 * 	}
 * }
 * 
 * 
 */

public class LocalInner {
	int a = 100;	// �ν��Ͻ� ��� ����
	public void InnerTest(int k) {	// �ν��Ͻ� ��� �޼ҵ�
		int b = 200; // ��������
		final int c = k;
		
		class Inner {	//���� Ŭ����
			public void getData() {
				System.out.println("int a : " + a);
				System.out.println("int b : " + b);
				System.out.println("final int c : " + c);
			} // end Inner
		} // �޼ҵ� ���� �ִ� ���� Ŭ���� ��ü ����
		// ������ ��ü�� ���ؼ� �޼ҵ� ȣ��
		Inner i = new Inner();
		i.getData();
	} // end InnerTest
	public static void main(String[] args) {
		LocalInner l = new LocalInner();
		l.InnerTest(1000);
	}
}
