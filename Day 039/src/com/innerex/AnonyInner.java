package com.innerex;

/* AnonyMous(�͸�) ���� Ŭ����
 * �͸� Ŭ����
 * 
 * �͸��̶�? -> �̸��� ���� ���� �ǹ��� -> ���ǵ� Ŭ������ �̸��� ���ٴ� ���� �ǹ���
 * - Event�� ������ ����
 * - Interface ������ �ʿ䰡 ����
 * - �Ϲ� �޼ҵ� ���ο��� ���Ǻθ� ���� �� �ִ�.
 * - abstract Ŭ������ ��� ���� �� �ִ�.
 * - �ݵ�� final�� ���� �ؾ��Ѵ�.
 * - implements�� �� ������ �Ѱ��� implements �Ѵ�.
 * 
 * ����
 * 
 * class Outer {
 * 	Inner inner = new Inner() {
 *  };
 * public void method() { // �Ϲ� ��� �޼ҵ�
 * 	}
 * }
 * 
 */

abstract class TestAbst {
	int data = 1000;

	public abstract void printData();// �߻� �޼ҵ�
}

public class AnonyInner {
	TestAbst in = new TestAbst() {
		@Override
		public void printData() {
			System.out.println("data : " + data);
		}
	};

	public static void main(String[] args) {
		AnonyInner ai = new AnonyInner();
		ai.in.printData();
	}
}
