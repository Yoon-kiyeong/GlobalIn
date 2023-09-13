package com.my;

public class Main08 {
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		int count = 0;
		int k = 1;

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr[i].length - 1; j >= 0; j--) {
//				arr[i][j] = (i + 20 + count) - (4 * j);
//			}
//			count -= 2;
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				arr[i][j] = (k * 4) - i;
				k++;
			}
			k = count + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
