package com.my;

/*
 * ���(Inheritance)
 * ���Ӱ� ������ Ŭ������ �̹� �����ϴ� Ŭ������ �ٸ� Ŭ������ ��ɿ� �ߺ��Ǵ� ���
 * �̹� �����ϴ� Ŭ������ �Ϻκ��̳� ��ü ������ ������ �� �ֵ��� �ϴ� ����� �ǹ���
 * 
 * ��, ����� ��ü�� �� �� ���� ���� �� �ִ� ������� �� ����� Ȯ���ϰ� Ŭ���� ���� ���踦 ���������ν� ��ü������ �� �ٸ� Ư¡�� ������ ������ ��밡 �ȴ�
 */

class SuperEx01 { // �θ�Ŭ����, Super Ŭ����, Base Ŭ����(�⺻ Ŭ����)
	// �θ�Ŭ����(Parent), Super Ŭ����, Base Ŭ����(�⺻ Ŭ����)
	// ~ ����� �ֱ� ���� �غ� Ŭ����

	protected double area;
	// protected : ���� Ŭ����, ���� ��Ű�� �������� ������ �����ϴ�
	// privated : ���� Ŭ���������� ���� �Ұ�(������ Ŭ���� �������� ������ ����)

	public SuperEx01() { // �θ� ������
		System.out.println("Super Class: ...........");
	}

	// �ν��Ͻ� �޼ҵ�
	public void write(String title) {
		System.out.println(title + area);
	}
}

// �ڹٴ� ���߻���� �������� �ʴ´�
// �ڹٴ� ���ϻ�Ӹ��� �����Ѵ�.
class InherEx01 extends SuperEx01 {
	// �ڽ� Ŭ����(Child), Sub Ŭ����, Derivation Ŭ����(���� Ŭ����)
	// - ����� �޾� ���Ӱ� ����� Ŭ����

	public InherEx01() {
		System.out.println("InherEx01 ������(sub class.....");
	}

	public void circle() {
		int r = 10;
		super.area = (double) (r * r * 3.14);
		write("���� ���� : ");
	}

	public void rect() {
		int w = 20;
		int h = 15;
		area = (double) (w * h);
		write("�簢���� ���� : ");

	}
}

public class Main01 extends SuperEx01 { // �ڽ� Ŭ����, Sub Ŭ����, Dervition Ŭ����(���� Ŭ����)
	public static void main(String[] args) {
		InherEx01 ie = new InherEx01();
		ie.circle();
		ie.rect();
	}
}
