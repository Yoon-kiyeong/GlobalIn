package com.my;

/*
 * -1^2+2^2+-3^2+4^2+...100^2 의 합계를 구하는 프로그램
 * (-1^2)+(2^2)+(-3^2)+
 */
public class Main10 {
	public static void main(String[] args) {
		int cnt = 1;
		int result = 0;
		int odd = 0;
		int even = 0;
		int result1 = 0;
//		while (cnt <= 100) {
//			if(cnt % 2 == 0) {
//				odd = cnt * cnt;
//				result += odd;
//			} if(cnt % 2 != 0) {
//				even = cnt * cnt;
//				result += even;
//			}
//			cnt++;
//		}

		while (cnt <= 100) {
			if (cnt % 2 == 0) {
				odd = cnt * cnt;
				result += odd;
			} else {
				even = cnt * cnt;
				result1 += even;
			}
			cnt++;
		}
		System.out.println(result - result1);

	}
}
