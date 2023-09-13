package com.my;

import java.util.Scanner;

/*
 * 비정형 배열, 가변 배열, 레가드 배열, 레그드 배열
 *  - 각 행마다 열의 개수가 다른 배열을 의미
 *  
 *  int arr[] = new int[4][];
 *  
 *  arr[0] = new int[1];
 *  arr[1] = new int[2];
 *  arr[2] = new int[3];
 *  arr[3] = new int[4];
 */
public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][];
//		int[][] arr = { { 10, 11, 12 }, { 20, 21 }, { 30, 31, 32, 33 }, { 40, 41, 42 } };
		int i, j, n;

		for (i = 0; i < arr.length; i++) {
			System.out.print("열의 개수 : ");
			n = sc.nextInt();
			arr[i] = new int[n];
			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
	}
}
