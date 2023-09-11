package com.my;

import java.util.Scanner;

/*
 * 키보드로 정수로 된 돈의 액수를 입력받아 오만원권 만원권, 천원권, 500원, 100원, 50원, 10원, 1원짜리 동전이 각각 몇개인지 반환하는 프로그램을 구현하시오
 * 단, 배열과 반복문을 이용하여 구현하시오
 */
public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // 변환시킬 돈의 종류
		int change = 0;
		
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			change = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + "원권 " + change + "개");
		}
	}
}