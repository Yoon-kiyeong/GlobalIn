package com.my;

public class Main07 {
	public static void main(String[] args) {
		String name = "Yoon GiYeong";
		int age = 29;
		char gender = 'M';
		String phone = "010-7204-7428";
		String address= "�۷ι���";
		
		System.out.printf("�̸� : %s%n", name);
		System.out.printf("���� : %d%n", age);
		System.out.printf("���� : %c%n", gender );
		System.out.printf("����ó : %s%n", phone);
		System.out.printf("�ּ� : %s%n", address);
		
		System.out.printf("���� �̸��� %s�̸�, ���̴� ��� %d���̸�\n",name,age);
		System.out.printf("������ %c�̰� ��ȭ����ȣ�� %s",gender, phone);
		System.out.printf("�̰�\n �ּҴ� %s�Դϴ�.",address);
	}
}
