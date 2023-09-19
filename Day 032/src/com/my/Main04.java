package com.my;

/*
 * ���� �Ӽ��� ������ ���簢���� ǥ���ϴ� Retangle Ŭ������ �����Ͻÿ�
 * int���� x, y, width height �ʵ� : �簢���� �����ϴ� ���� ũ��
 * x, y, width, height �Ӽ����� �Ű������� �޾� ����ʵ带 �ʱ�ȭ�ϴ� ������
 * int square() : �簢���� ���̸� �����ϴ� �޼ҵ�
 * void show : �簢���� ��ǥ�� ���̸� ȭ�鿡 ���
 * boolean contains(Rectangle r) : �Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����, ������ false ����
 * 
 * main() �޼ҵ�
 * Rectangle r = new Rectangle(2,2,8,7);
 * Rectangle s = new Rectangle(5,5,6,6);
 * Rectangle t = new Rectangle(1,1,10,10);
 * 
 * r.show();
 * System.out.println("s�� ������ " + s.square());
 * if(t.contains(r)) System.out.println("t�� r�� �����մϴ�);
 * if(t.contains(s)) System.out.println("t�� s�� �����մϴ�);
 * 
 *  ���� ���
 *  (2,2)���� ũ�Ⱑ 8X7�� �簢��
 *  s�� ������ 36
 *  t�� r�� �����Ѵ�
 *   */

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return width * height;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + "���� ũ�Ⱑ " + width + "X" + height + "�� �簢��");
	}

	public boolean contains(Rectangle r) {
//		if((r.x >= this.x && r.y >= this.y) || (r.x + r.width) >= ( this.x + this.width) && (r.y + r.height) >= (this.y + this.height)) {
		//   2   >=   1       2  >=  1           2 + 8 = 10    >=    1 + 10 == 11              2 + 7 = 9     >=       1 + 10 = 11
//			return true;
//		} else {
//			return false;
//		}
		
		if(x < r.x && y < r.y && x + width > r.x + r.width && y + height > r.y + r.height)
			return true;
		else
			return false;
	}
}

public class Main04 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������" + s.square());
		if(t.contains(r)) 
			System.out.println("t�� r�� �����մϴ�");
		if(t.contains(s)) 
			System.out.println("t�� s�� �����մϴ�");
	}
}
