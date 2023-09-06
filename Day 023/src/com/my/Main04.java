package com.my;

/*
 * 숫자를 입력받아 3 ~ 5는 "봄", 6 ~ 8은 "여름", 9 ~ 11은 "가을, 12 ~ 2의 경우
 * 그외 숫자가 입력되면 잘못입력이라고출력하는 프로그램을 구현
 */
import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요 ");
		int month = sc.nextInt();

		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울");
		} else {
			System.out.println("월을 잘못 입력하셨습니다");
		}

		System.out.print("월을 입력하세요 ");
		int num = sc.nextInt();
		
		switch(num) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 1: case 2: case 12:
			System.out.println("겨울");
			break;
		default:
			System.out.println("월을 잘못 입력하셨습니다");
			break;
		}
	}
}
