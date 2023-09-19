package com.my;

/*
 * this�� this()
 * 
 * this
 * 	- Ư�� ��ä ������ �ڽ��� �����Ǿ��� ���� �ּҰ� ������ �ǹ���
 * 	- ��ü�� �ּҴ� ��ü�� �����Ǳ� �������� �𸣱� ������ ��ü ���� �� �ڽ��� �ּ� ��ü��
 * 
 * this()
 *  - ���� ��ü�� ������ �Լ��� �ǹ���
 *  - ������ �ȿ��� �����ε� �� �ٸ� �����ڸ� ȣ���� ��� this()��� Ű����� ȣ����
 */
public class Main05 {
	String name;
	String Serial;
	String tel;

	public Main05() {
		this.name = "���⿵";
		this.Serial = "000000-0000000";
		this.tel = "010-0000-0000";
	}

	public Main05(String name) { // �⺻ ������
		this();
		this.name = name;
	}

	public Main05(String name, String Serial) {
		this(name);
		this.Serial = Serial;
	}

	public Main05(String name, String Serial, String tel) {
		this(name);
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerial() {
		return Serial;
	}

	public void setSerial(String serial) {
		Serial = serial;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public static void main(String[] args) {
		Main05 ma = new Main05();
		System.out.println("�̸� : " + ma.getName());
		System.out.println("�ֹι�ȣ : " + ma.getSerial());
		System.out.println("��ȭ��ȣ : " + ma.getTel());
	}
}
