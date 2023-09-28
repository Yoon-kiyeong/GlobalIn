package com.my;

import java.util.Scanner;

/*
 * 컴퓨터와 사용자 사이의 가위 바위 보 게임을 구현하시오
 * 사용자가 먼저 시작한다.
 * 사용자가 가위 바위 보 중 하나를 입력하고 Enter를 누르면 컴퓨터는 가위 바위 보 중에서 랜덤으로 하나를 선택하여 출력한다.
 * 사용자가 입력한 값과 컴퓨터가 출력한 값을 비교하여 누가 이겼는지를 판단한다.
 * 사용자가 가위 바위 보 대신 "그만"이라고 입력하면 프로그램은 중료한다.
 * 단, 가위 바위 보는 String 배열을 이용, 랜덤함수, 비교함수를 사용하시오
 * 
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String user = "";
		String[] cpu = { "가위", "바위", "보" };
		int num = (int) (Math.random() * 3);
		while (true) {
			System.out.print("가위 바위 보 : ");
			user = sc.next();
			if (user.equals("그만")) {
				break;
			}
			String b = cpu[(int) (Math.random() * 3)];
			System.out.println("사용자 : " + user + ", 컴퓨터 : " + b);
			if (user.equals("가위")) {
				if (b.equals("보")) {
					System.out.println("사용자가 이겼습니다.");
				}
				if (b.equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}
				if (b.equals("가위")) {
					System.out.println("비겼습니다");
				}
			} else if (user.equals("바위")) {
				if (b.equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				if (b.equals("바위")) {
					System.out.println("비겼습니다");
				}
				if (b.equals("보")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			} else if (user.equals("보")) {
				if (b.equals("보")) {
					System.out.println("비겼습니다");
				}
				if (b.equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
				}
				if (b.equals("가위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
		}
	}
}

//			switch (user) {
//			case "가위":
//				if (num == 0) {
//					System.out.println("비겼습니다");
//				} else if (num == 1) {
//					System.out.println("컴퓨터가 이겼습니다");
//				} else if (num == 2) {
//					System.out.println("사용자가 이겼습니다");
//				}
//				break;
//			case "바위":
//				if (num == 0) {
//					System.out.println("사용자가 이겼습니다");
//				} else if (num == 1) {
//					System.out.println("비겼습니다");
//				} else if (num == 2) {
//					System.out.println("컴퓨터가 이겼습니다");
//				}
//				break;
//			case "보":
//				if (num == 0) {
//					System.out.println("컴퓨터가 이겼습니다");
//				} else if (num == 1) {
//					System.out.println("사용자가 이겼습니다");
//				} else if (num == 2) {
//					System.out.println("비겼습니다");
//				}
//				break;
//			}