package com.my;

/**
 * 1 2 3 4 5 6
 *
 */
public class Main04 {
	public static void main(String[] args) {
		// 배열선언
		// 1. 배열 선언 및 초기화
		int[][] arr1 = new int[3][3];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;

		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;

		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;

		// 2.
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 3. 반복문
		int arr3[][] = new int[3][3];
		// 반복문을 이용해 배열에 값 저장
		int n = 1;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = n;
				n++;
			}
		}
		
		for(int i = 0 ; i <arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("배열 1");
		System.out.println();
		
		for(int i = 0 ; i <arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("배열 2");
		System.out.println();
		
		for(int i = 0 ; i <arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("베열3");
		System.out.println();
	}
}
