package com.my;

/**
 * 1 2 3 4 5 6
 *
 */
public class Main04 {
	public static void main(String[] args) {
		// �迭����
		// 1. �迭 ���� �� �ʱ�ȭ
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

		// 3. �ݺ���
		int arr3[][] = new int[3][3];
		// �ݺ����� �̿��� �迭�� �� ����
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
		System.out.println("�迭 1");
		System.out.println();
		
		for(int i = 0 ; i <arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("�迭 2");
		System.out.println();
		
		for(int i = 0 ; i <arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("����3");
		System.out.println();
	}
}
