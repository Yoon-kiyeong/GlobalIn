package com.my;

/*
 * ������
 * 
 * - �� Ÿ���� ���������� ���� Ÿ���� ��ü�� ������ �� �ֵ��� �ϴ� ���� �ǹ���
 * - �θ� Ŭ���� Ÿ���� ���������� �ڽ� Ŭ������ �ν��Ͻ��� ������ �� �ֵ��� �Ѵ�.
 * - �θ� Ŭ���� = �ڽ�
 * 
 * ���� ���� �� ��ü(�ν��Ͻ�) ����
 * 
 * Super super = new Super();
 * Sub sub = new Sub();
 * 
 * ������ ���� �� ��ü ����
 * Super s = new Sub();
 * 
 * Super
 * Sub1, Sub2, Sub3(�ڽĵ�);
 * Super s1 = new Super();
 * Super s2 = new Super();
 * Super s3 = new Super();
 * 
 * ������
 * Super s1 = new Sub1();
 * Super s2 = new Sub2();
 * Super s3 = new Sub3();
 * 
 * - ���������� �޼ҵ�� �ڽ� �޼ҵ带 ȣ���Ѵ�
 * ���������� ��� �ʵ�� �θ��� ���� ����Ѵ�.
 */

class ParentEx {
	int foo = 5;

	public int getNumber(int a) {
		return a + 1;
	}
}

public class Main04 extends ParentEx {
	int foo = 7;

	@Override
	public int getNumber(int a) {
		return a + 2;
	}

	public static void main(String[] args) {
		//������
		ParentEx pe = new ParentEx();
		ParentEx pe1 = new Main04();
		System.out.println(pe.getNumber(2));	//�θ� �޼ҵ� ȣ��
		System.out.println(pe1.getNumber(5));	//�ڽ� �޼ҵ� ȣ��
		System.out.println(pe.foo);
		System.out.println(pe1.foo);
		
	}
}
