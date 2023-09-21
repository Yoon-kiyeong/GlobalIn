package com.reserve;

import java.util.*;

public class Group {
	// 좌석의 타입을 선언
	char type; // S, A, B

	// 좌석을 객체배열로 선언
	private Seat[] seats;

	private Scanner sc = new Scanner(System.in);

	public Group(char type, int num) {
		this.type = type;
		seats = new Seat[num]; // 객체배열의 크기를 정함

		for (int i = 0; i < seats.length; i++) {
			// 배열의 크기 만큼 객체를 생성
			seats[i] = new Seat();
		}
	}

	public boolean reserve() {
		int no;
		String name;

		System.out.print("이름 : ");
		name = sc.next();

		System.out.print("번호 : ");
		no = sc.nextInt();

		if (no < 1 || no >= seats.length) {
			System.out.println("잘못 입력하신 좌석 번호입니다");
			return false;
		}

		if (seats[no - 1].isOccupied()) { // 이미 예약된 좌석번호라면
			System.out.println("이미 예약된 좌석번호 입니다");
			return false;
		}

		seats[no - 1].reserve(name);
		return true;
	}

	public void show() { // type별 전체 좌석출력
		System.out.print(type + " : ");
		for (int i = 0; i < seats.length; i++) {
			if (seats[i].isOccupied()) {
				System.out.print(seats[i].getName());
			} else {
				System.out.print("☆");
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	public boolean cancel() { // 현재 type좌석을 취소
		show();
		System.out.print("이름  : ");
		String name = sc.next();
		if (name != null) {
			for (int i = 0; i < seats.length; i++) {
				if (seats[i].match(name)) {
					seats[i].cancel();
					return true;
				}
			}
			System.out.println("예약한 사람 이름을 찾을 수 업습니다.");
		}
		return false;
	}
}