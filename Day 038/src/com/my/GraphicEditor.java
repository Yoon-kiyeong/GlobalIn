package com.my;

import java.util.Scanner;

public class GraphicEditor {
	Shape start;
	Shape end;

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�׷��� ������ beauty�� �����մϴ�");
		while (true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4) : ");
			int data = sc.nextInt();
			switch (data) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) : ");
				int shape = sc.nextInt();
				insert(shape);
				break;
			case 2:
				System.out.println("������ ������ ��ġ");
				int target = sc.nextInt();
				delete(target);
				break;
			case 3:
				print();
				break;
			case 4:
				System.out.println("beauty�� �����մϴ�");
				return;
			}
		}
	}

	public void insert(int shape) {
		Shape s = null;
		switch (shape) {
		case 1:
			s = new Line();
			break;
		case 2:
			s = new Rect();
			break;
		case 3:
			s = new Circle();
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		if (start == null) {
			start = s;
			end = start;
		} else {
			end.setNext(s);
			end = s;
		}
	}

	public void delete(int target) {
		Shape current = start;
		Shape temp = start;
		int i;
		if (target == 1) {
			if (start == end) {
				start = null;
				end = null;
				return;
			} else {
				start = start.getNext();
				return;
			}
		}
		for (i = 0; i < target; i++) {
			temp = current;
			current = current.getNext();
			if (current == null) {
				System.out.println("������ �� �����ϴ�");
				return;
			}
		}
		if (i == target) {
			temp.setNext(current.getNext());
			end = temp;
		} else
			temp.setNext(current.getNext());
	}

	public void print() {
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.getNext();
		}
	}

	public static void main(String[] args) {
		GraphicEditor e = new GraphicEditor();
		e.run();
	}

}
