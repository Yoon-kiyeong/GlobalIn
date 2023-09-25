package com.AbsEx;

/*	추상 클래스 Calculator를 상속 받아서  GoodCalc 클래스를 구현하시오
 * 
 * 결과
 * 5
 * -1
 * 3.0
 */

public class GoodCalc {
	public static void main(String[] args) {
		GoodCalc gc = new GoodCalc();
		System.out.println(gc.add(2, 3));
		System.out.println(gc.min(2, 3));
		System.out.println(gc.avg(new int[] { 2, 3, 4 }));

	}

	private double avg(int[] a) {
		double sum = 0;
		for(int i = 0 ; i < a.length; i++ ) {
			sum += a[i];
		}
		return (double)sum / a.length;
	}

	private int min(int a, int b) {
		return a - b;
	}

	private int add(int a, int b) {
		return a + b;
	}

}
