package com.my;
/*
 * �̸�, ��ȭ��ȣ �ʵ�� ������ ���� ���� Phone Ŭ������ �ۼ��ϰ�,
 * ������ ���� �����ǵ��� PhoneBook Ŭ������ �����Ͻÿ�
 * 
 * �ο���:3
 * �̸��� ��ȭ��ȣ (�̸��� ��ȣ�� ��ĭ���� �Է�) : ���浿 777-7777
 * �̸��� ��ȭ��ȣ (�̸��� ��ȣ�� ��ĭ���� �Է�) : ���浿 888-8888
 * �̸��� ��ȭ��ȣ (�̸��� ��ȣ�� ��ĭ���� �Է�) : �ٱ浿 999-9999
 * ����Ǿ����ϴ�...
 * �˻��� �̸� : ȫ�浿
 * ȫ�浿�� �����ϴ�
 * �˻��� �̸� : �ٱ浿
 * �ٱ浿�� ��ȣ�� 999-9999
 * �˻��� �̸� : �׸� -> �׸��� �Է��ϸ� ���α׷��� ����
 * 
 * ���ڿ��� ���� ���� equals() �޼ҵ� Ȱ��
 * 
 */

import java.util.Scanner;

class Phone {
	String name;
	String tel;

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

class PhoneBook {

	private Scanner sc;
	private Phone[] phoneBooks;

	public PhoneBook() {
		sc = new Scanner(System.in);

	}

	public void read() {
		System.out.print("�ο��� : ");
		int num = sc.nextInt();
		phoneBooks = new Phone[num];

		for (int i = 0; i < phoneBooks.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ (�̸��� ��ȣ�� ��ĭ���� �Է�) : ");
			String name = sc.next();
			String tel = sc.next();
			phoneBooks[i] = new Phone(name, tel);
		}
	}
	
	public String search(String name) {
		for(int i = 0; i < phoneBooks.length; i++) {
			if(phoneBooks[i].getName().equals(name)) {
				return phoneBooks[i].getTel();
			}
		}
		return null;
	}
	
	public void run() {
		read();
		while(true) {
			System.out.print("�˻��� �̸� �Է� : ");
			String name = sc.next();
			if(name.equals("�׸�")) {
				break;
			}
			String tel = search(name);
			if(tel == null) {
				System.out.println(name + "�� �����ϴ�");
			} else {
				System.out.println(name + "�� ��ȣ�� " + tel + "�Դϴ�");
			}
		}
	}
}

public class Main07 {
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.run();
	}
}
