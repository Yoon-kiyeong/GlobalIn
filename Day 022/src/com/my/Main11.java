package com.my;

import java.util.Scanner;

/*
 * Scanner 클래스를 이용해 2자리의 정수 (10 ~ 99)를 입력받고, 10의 자리와 1의 자리가 같은지를 판정하는 프로그램을 구현하시오
 * 주요 연산자 : /, %연산자 활용
 * 
 * 출력 결과
 * 2자리 정수 입력 : 77
 * Yes! 10의 자리와 1의 자리가 같습니다!
 */
public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리 정수 입력 : ");
		int num = sc.nextInt();
		if(num % 11 == 0) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다!");
		}
	}
}
