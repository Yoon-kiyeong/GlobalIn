package com.interEx;

interface Ademo {
	public void write();
}

interface Bdemo {
	public void print();
}

//�������̽��� 2�� �̻��� �������̽��� ����� �� �ִ�.
class CdemoImpl implements Ademo, Bdemo {

	@Override
	public void print() {
		System.out.println("Bdemo�� �������̽� �޼ҵ�");
	}

	@Override
	public void write() {
		System.out.println("Ademo�� �������̽� �޼ҵ�");
	}

}

public class InterfaceEx02 {
	public static void main(String[] args) {
		CdemoImpl cd = new CdemoImpl();
		cd.print();
		cd.write();
		
		//��ĳ����
		Ademo a = new CdemoImpl();
		Bdemo b = new CdemoImpl();
		
		((Bdemo)a).print();
		a.write();
		
		b.print();
		((Ademo)b).write();	//�ٿ� ĳ����
	}
}
