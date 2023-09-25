package com.interEx;

interface Demo {
	public static final double PI = 3.14;
	//�������̽��� ��� ������ static final�� ������ �ʾƵ� �����Ϸ��� �ڵ����� �˾Ƽ� static final�� �ٿ��ش�.
	public int a = 10; //���
	
	public void print(); // �߻� �޼ҵ�
}

class DemoImpl implements Demo {

	public void write() { //�Ϲ� �޼ҵ� -> Demoimpl�� Ŭ�����̱� ������ �Ϲ� �޼ҵ� �ۼ��� ����
		//Ŭ������ ���� �� �Ϲ� �޼ҵ�
		System.out.println("Ŭ������ ���� �� �Ϲ� �޼ҵ�");
		
	}
	
	@Override
	public void print() { 
		System.out.println("�������̽��� �޼ҵ带 ������");
	}
	
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		// �������̽��� ��ü�� ���� ��ü�� �̿��Ͽ� ������
		Demo dm = new DemoImpl(); // �� ĳ����
		
		dm.print();
//		dm.write(); // ������ ����
		((DemoImpl)dm).write();	//�ٿ� ĳ����
		
		System.out.println(Demo.PI);
		System.out.println(Demo.a);
	}
}
