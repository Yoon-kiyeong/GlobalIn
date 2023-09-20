package com.my;

import java.util.Scanner;

class Group {
	String[] s = new String[10];
	String[] a = new String[10];
	String[] b = new String[10];
	Scanner sc = new Scanner(System.in);

	public Group() {
		for (int i = 0; i < s.length; i++) {
			s[i] = "☆";
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = "☆";
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = "☆";
		}
	}

	public void reserve() {
		while (true) {
			System.out.print("좌석구분 : S(1), A(2), B(3) ");
			int seat = sc.nextInt();
			if (seat == 1) {
				System.out.print("S : ");
				for (int i = 0; i < s.length; i++) {
					System.out.print(s[i] + "\t");
				}
			} else if (seat == 2) {
				System.out.print("A : ");
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i] + "\t");
				}
			} else if (seat == 3) {
				System.out.print("B : ");
				for (int i = 0; i < b.length; i++) {
					System.out.print(b[i] + "\t");
				}
			}
			System.out.println();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("번호 : ");
			int number = sc.nextInt();
			if (number < 1 || number > 10) {
				System.out.println("없는 좌석입니다. 다시 입력해주세요");
				continue;
			}

			switch (seat) {
			case 1:
				s[number - 1] = name;
				break;
			case 2:
				a[number - 1] = name;
				break;
			case 3:
				b[number - 1] = name;
				break;
			}
			break;
		}
	}

	public void cancel() {
		System.out.print("좌석 : S:1, A:2, B:3 ");
		int Class = sc.nextInt();
		for (int i = 0; i < s.length; i++) {
			if (Class == 1) {
				System.out.print(s[i] + "\t");
			}
		}
		
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (Class == 2) {
				System.out.print(a[i] + "\t");
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (Class == 3) {
				System.out.print(b[i] + "\t");
			}
		}
	}

	public void show() {
//		System.out.println("좌석 등급 선택 ");
//		System.out.print("S(1), A(2), B(3) ");
//		int Class = sc.nextInt();
//		if (Class == 1) {
//			for (int i = 0; i < s.length; i++) {
//				System.out.print(s[i] + "\t");
//			}
//			System.out.println();
//		}
//		if (Class == 2) {
//			for (int i = 0; i < a.length; i++) {
//				System.out.print(a[i] + "\t");
//			}
//			System.out.println();
//		}
//		if (Class == 3) {
//			for (int i = 0; i < b.length; i++) {
//				System.out.print(b[i] + "\t");
//			}
//			System.out.println();
//		}
		System.out.print("S : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(s[i] + "\t");
		}
		System.out.println();
		System.out.print("A : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		System.out.print("b : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
	}
}

class Seat extends Group {
	String name;
	int number;

	Group g = new Group();
	Scanner sc = new Scanner(System.in);

	public void cancel() {
		System.out.print("취소할 성함 입력 : ");
		String name = sc.next();
		for (int i = 0; i < s.length; i++) {
			if (name.equals(s[i])) {
				s[i] = "☆";
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (name.equals(a[i])) {
				a[i] = "☆";
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (name.equals(b[i])) {
				b[i] = "☆";
			}
		}
	}

	public void reserve() {
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("좌석구분 : S(1), A(2), B(3)  ");
		int Class = sc.nextInt();
		System.out.print("좌석번호 : ");
		int number = sc.nextInt();
		if (number == 1) {
			System.out.print("S : ");
			for (int i = 0; i < s.length; i++) {
				System.out.print(s[i] + "\t");
			}
		} else if (number == 2) {
			System.out.print("A : ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + "\t");
			}
		} else if (number == 3) {
			System.out.print("B : ");
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + "\t");
			}
		}
		switch (Class) {
		case 1:
			s[number - 1] = name;
			break;
		case 2:
			a[number - 1] = name;
			break;
		case 3:
			b[number - 1] = name;
			break;
		}

	}

	public boolean isOccupied() {
		for (int i = 0; i < 10; i++) {
			if (s[i] != null || a[i] != null || b[i] != null) {
				System.out.println(name + "님은 이미 예약되었습니다 ");
			} else {
				return false;
			}
		}
		return true;
	}

	public void match() {

		System.out.print("조회할 이름 입력 : ");
		String name = sc.next();
		for (int i = 0; i < s.length || i < a.length || i < b.length; i++) {
			if (name.equals(s[i]) || name.equals(a[i]) || name.equals(b[i])) {
				System.out.println("예약자 이름을 찾을 수 없습니다.");
			}
		}
	}
}

class Concert extends Group {

	Scanner sc = new Scanner(System.in);

	Group g = new Group();
	Seat s = new Seat();

	public void reserve() {

	}

	public void cancel() {

	}

	public void run() {
		while (true) {
			System.out.println("글로벌인 콘서트 예약시스템입니다");
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 --> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				g.reserve();
				break;
			case 2:
				g.show();
				break;
			case 3:
				g.cancel();
				break;
			case 4:
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			if (menu == 4) {
				System.out.println("콘서트 예약 프로그램을 종료합니다");
				break;

			}
		}
	}
}

public class Main03 {
	public static void main(String[] args) {
		Group g = new Group();
		Seat se = new Seat();
		Concert c = new Concert();

		c.run();
	}
}
