package com.study;

public class Example445 {
	public static void main(String[] args) {
		int[] myList = { 2, 3, 6, 0 };
		Calculator1.divide(myList, 2, 0);
		// ������ ���ܰ� RuntimeException�̹Ƿ� try-catch�� ����ó���ϴ� ���� �ǹ��� �ƴ�
	}
}

class Calculator1 {
	static void divide(int[] intlist, int a, int b) throws RuntimeException {
		System.out.println(intlist[a] / intlist[b]);
	}

}
