package com.study;

public class Example444 {
	public static void main(String[] args) {
		int[] myList = { 2, 3, 6, 0 };
		try { // 뎐저진 예외를 여기서 꼭 처리해야 함
			Calculator.divide(myList, 5, 0);
		} catch (Exception e) {
			System.out.println("Exception 발생");
		}
		try {
			Calculator.divide(myList, 2, 0);
		} catch (Exception e) {
			System.out.println("Exception 발생");
		}
	}
}

class Calculator {
	static void divide(int[] intlist, int a, int b) throws Exception {
		System.out.println(intlist[a] / intlist[b]);
	}

}