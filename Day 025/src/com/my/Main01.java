package com.my;
/*
 * -50에서 1까지의 수를 출력하는 프로그램을 작성하라
 * 이때, 한 줄에는 5개의 수만을 출력하고, 수들 사이를 탭 간격만큼 띄어라.
 */
public class Main01 {
	public static void main(String[] args) {
		int num = -50;
		
		while(num <= 1) {
			if(num % 5 == 0) {
				System.out.print("\n" + num + "\t");
				num++;
			} else {
				System.out.print(num + "\t");
				num++;
			}
		}
	}
}
