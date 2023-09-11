package com.my;
/*
 * 1 ~ 100까지의 수 중 짝수의 합계를 출력하는 프로그램
 */
public class Main04 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		do {
			num++;
			sum += num;
			num++;
		} while(num <= 100);
		System.out.println(sum);
	} 
}
