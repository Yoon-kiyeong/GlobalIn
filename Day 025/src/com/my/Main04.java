package com.my;
/*
 * 1 ~ 100������ �� �� ¦���� �հ踦 ����ϴ� ���α׷�
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
