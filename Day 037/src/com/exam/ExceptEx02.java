package com.exam;

import java.util.Scanner;

/*	
 * 	위의 문 1을 try ~ catch블럭을 이용하여 정수를 0으로 나눌 경우 "0으로 나눌 수 없습니다"를 출력하는 프로그램을 구현하시오
 * 	반복문을 이용하여 정상적으로 처리되었을 경우 프로그램이 종료
 * 
 * 결과
 * 나누는 수 : 100
 * 나눌 수 : 0
 * 0으로 나눌 수 없습니다. 다시 입력하세요
 * 나누는 수 : 100
 * 나누는 수 : 5
 * 100을 5로 나누면 몫은 20입니다
 */

public class ExceptEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("나누는 수 : ");
			int a = sc.nextInt();
			System.out.print("나눌 수 : ");
			int b = sc.nextInt();
			try {
				System.out.println(a + "를 " + b + "로 나누면 몫은 " + a / b + "입니다");
				break;
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다, 다시 입력하세요");
				continue;
			}
		}
	}
}
