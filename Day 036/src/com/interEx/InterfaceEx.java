package com.interEx;

/*
 * �������̽��� �ܵ����� ����� �� ������ ����ϱ� ���ؼ��� �Ϲ� Ŭ�������� �������� ������ �Ѵ�
 * �Ϲ� Ŭ�������� implements ��� ������ Ư�� �������̽��� ���� Ŭ�������� �����ϰڴٰ� �Ͻ��ϴ� ���̴�.
 * �������̽��� ������ �߻� �޼ҵ���� �������� Ŭ�������� �ݵ�� ���� ����������(������) �ؾ���

 */

public class InterfaceEx implements InterEx {

	@Override
	public int getA() {
		return A;
	}

	public static void main(String[] args) {
		InterfaceEx ie = new InterfaceEx();
		System.out.println("A : " + A);
	}

}
