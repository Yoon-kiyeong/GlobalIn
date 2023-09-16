package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1번을 누르면 두개의 숫자를 입력받아 그 중 큰수를 출력하는 기능
 * 2번을 누르면 두개의 숫자를 입력받아 그 사이의 합계를 구하는 기능
 * 3번을 누르면 세개의 수를 입력받아 큰 순서대로 출력하는 기능
 * 
 * 함수를 이용하여 구현
 * 함수명
 * 1 : aaa()
 * 2 : bbb()
 * 3 : ccc()
 */

public class Main04 {

	public int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫 번째 정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		int b = Integer.parseInt(br.readLine());

		if (a > b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
		int sum = 0;
		for (int k = a; k <= b; k++) {
			sum += k;
		}
		return sum;
	}

	public String ccc(int x, int y, int z) throws IOException {
		if (y >= x && y >= z) {
			int temp = x;
			x = y;
			y = temp;
		} else if (z >= x && z >= y) {
			int temp = x;
			x = z;
			z = temp;
		}
		if (z >= y) {
			int temp = y;
			y = z;
			z = temp;
		}

		String abc = x + " >= " + y + " >= " + z;
		return abc;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;

		Main04 ma = new Main04();

		while (true) {
			System.out.print("1 : 최대값, 2: 사잇값, 3: 수 나열, 4: 종료 ");
			x = Integer.parseInt(br.readLine());
			if (x == 1) {
				int k = ma.aaa();
				System.out.println("두 개의 정수 중 가장 큰 정수는 " + k + "입니다");
			} else if (x == 2) {
				System.out.println(ma.bbb());
			} else if (x == 3) {
				System.out.print("첫 번째 정수 입력 : ");
				int firstNum = Integer.parseInt(br.readLine());
				System.out.print("두 번째 정수 입력 : ");
				int secondNum = Integer.parseInt(br.readLine());
				System.out.print("세 번째 정수 입력 : ");
				int thirdNum = Integer.parseInt(br.readLine());
				String str = ma.ccc(firstNum, secondNum, thirdNum);

				System.out.println("큰 순서대로 " + str);
			} else if (x == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다");
			}
			System.out.println();
		}
		System.out.println("ㅅㄱ ㅂ");
	}
}
