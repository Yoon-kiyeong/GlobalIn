package com.my;

import java.util.Arrays;

/*
 * 2���� static ���� ArrayUtil Ŭ������ �ϼ��Ͽ� �����Ͻÿ�
 * StaticEx Ŭ������ main()�Լ��� �����Ͽ� concat()�� print()�Լ��� �����Ͻÿ�
 * 
 * ��°��
 * [1 5 7 9 3 6 -1 100 77]
 */

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		// �迭 a�� b�� ������ ���ο� �迭 ����
		int newArray[] = new int[a.length + b.length];
		int index = 0;

//		for (int i = 0 ; i < a.length; i++) {
//			newArray[i] = a[i];
//		}
//		for (int i = 0 ; i < b.length; i++) {
//			newArray[i] = b[i];
//		}

		for (int i : a) {
			newArray[index++] = i;
		}

		for (int i : b) {
			newArray[index++] = i;
		}

		return newArray;
	}

	public static void print(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}

public class Main01 {
	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
