package com.my;

import java.util.Scanner;

/*
 *  처음 입력받은 인원수 만큼의 학생 이름과 전화번호를 입력받고, 입력받은 내용을 출력하는 프로그램을 구현하시오
 *  단, 배열 활용
 */
public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 처리할 학생 수 (명) : ");
		int num = sc.nextInt();

		String name[] = new String[num];
		String number[] = new String[num];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 전화번호 입력 : ");
			name[i] = sc.next();
			number[i] = sc.next();
		}

		for(int i = 0; i <name.length; i++) {
			System.out.println("이름 :" + name[i] + " 전화번호 : " + number[i]);
		}
	}
}
