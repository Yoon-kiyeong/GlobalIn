package com.my;

/*
 * 1 ~ 100까지의 수 중에서
 * 4의 배수만 출력하는 프로그램을 구현하시오
 * 단, 한 줄에 5개씩 출력
 * 
 */
public class Main07 {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 100; i++) {
			if (i % 4 == 0) 
				System.out.print(i + "\t");
			if (i % 20 == 0)
				System.out.println();
		}
	}
}
