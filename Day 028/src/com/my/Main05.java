package com.my;

/*
 * 가변배열을 이용하여 데이터를 배열에 저장하고 출력하는 프로그램을 구현
 */
public class Main05 {
	public static void main(String[] args) {
		int arr[][] = new int[4][];
		int count = 1;
		int k = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[k];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count;
				count++;
			}
			k++;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
