package com.my;

import java.util.Scanner;

public class GraphicEditor {
	Shape start;
	Shape end;

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty를 실행합니다");
		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) : ");
			int data = sc.nextInt();
			switch (data) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) : ");
				int shape = sc.nextInt();
				insert(shape);
				break;
			case 2:
				System.out.println("삭제할 도형의 위치");
				int target = sc.nextInt();
				delete(target);
				break;
			case 3:
				print();
				break;
			case 4:
				System.out.println("beauty를 종료합니다");
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
			System.out.println("잘못된 입력입니다.");
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
				System.out.println("삭제할 수 없습니다");
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
