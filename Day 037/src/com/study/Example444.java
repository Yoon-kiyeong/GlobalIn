package com.study;

public class Example444 {
	public static void main(String[] args) {
		int[] myList = { 2, 3, 6, 0 };
		try { // ������ ���ܸ� ���⼭ �� ó���ؾ� ��
			Calculator.divide(myList, 5, 0);
		} catch (Exception e) {
			System.out.println("Exception �߻�");
		}
		try {
			Calculator.divide(myList, 2, 0);
		} catch (Exception e) {
			System.out.println("Exception �߻�");
		}
	}
}

class Calculator {
	static void divide(int[] intlist, int a, int b) throws Exception {
		System.out.println(intlist[a] / intlist[b]);
	}

}