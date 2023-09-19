package com.my;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다");
	}
}

class MonthScedule {
	private Day[] days; // Day 객체 배열
	private int dayNum = 30;
	int num;
	int day;

	Scanner sc = new Scanner(System.in);

	public void display() {
		days = new Day[dayNum];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}

		System.out.println("이번 달 스케줄 관리 ㅍ로그램");
		do {
			System.out.print("입력:1, 보기:2, 끝내기:3 : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				do {
					System.out.print("날짜(1~30) : ");
					day = sc.nextInt();
					day--;

					if (day < 0 || day > dayNum)
						;
					{
						System.out.println("날짜를 다시 입력해 주세요");
					}
				} while (day < 0 || day > dayNum);
				System.out.print("할일 : ");
				String work = sc.next();
				days[day].set(work);
				break;
			case 2:
				System.out.println("날짜(1 ~ 30) : " + (day + 1));
				System.out.print((day + 1) + "일의 할 일은 ");
				days[day].show();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				break;
			}
		} while (num > 0 && num < 3);
	}
}

public class Main06 {
	public static void main(String[] args) {
		MonthScedule ms = new MonthScedule();
		ms.display();
	}
}
