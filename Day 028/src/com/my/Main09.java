package com.my;

public class Main09 {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int k = 1;
//		for (int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (i + 1) + 4 * j;
//			}
//		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[j][i] = k;
				k++;
			}
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
}
