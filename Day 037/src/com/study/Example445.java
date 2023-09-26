package com.study;

public class Example445 {
	public static void main(String[] args) {
		int[] myList = { 2, 3, 6, 0 };
		Calculator1.divide(myList, 2, 0);
		// 던져진 예외가 RuntimeException이므로 try-catch로 예외처리하는 것이 의무가 아님
	}
}

class Calculator1 {
	static void divide(int[] intlist, int a, int b) throws RuntimeException {
		System.out.println(intlist[a] / intlist[b]);
	}

}
