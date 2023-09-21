package com.reserve;

import java.util.Scanner;

public class Concert {

	private Scanner sc = new Scanner(System.in);

	// 콘서트 이름
	private String hallName;

	// 그룹을 객체 배열로 선언
	private Group[] group = new Group[3];

	public Concert(String hallName) {
		this.hallName = hallName;

		group[0] = new Group('S', 10);
		group[1] = new Group('A', 10);
		group[2] = new Group('B', 10);
	}

	public void reserve() { // 예약
		System.out.println("좌석 구분: S(1), A(2), B(3)");
		int type = sc.nextInt();
		if (type < 1 || type > 3) {
			System.out.println("좌석 등급을 잘못 입력하셨습니다");
			return;
		}
		group[type-1].reserve();
	}

	public void search() {
		for(int i = 0; i < group.length; i++) {
			group[i].show();
		}
		System.out.println("조회를 완료하였습니다");
	}

	public void cancel() {
		System.out.print("좌석 구분: S(1), A(2), B(3)");
		int type = sc.nextInt();
		if (type < 1 || type > 3) {
			System.out.println("좌석 등급을 잘못 입력하셨습니다");
			return;
		}
		group[type-1].cancel();
	}
	
	

	public void run() {
		System.out.println(hallName + " 예약 프로그램입니다");
		int choice = 0;

		while (choice != 4) {
			System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4  --> ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				reserve();
				break;
			case 2:
				search();
				break;
			case 3:
				cancel();
				break;
			case 4:
				System.out.println("콘서트, 예약 프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		}

	}

}
