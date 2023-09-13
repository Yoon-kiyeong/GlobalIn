package com.my;

public class Main07 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int k = 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = k;
					k++;
				}
			} else {
				for (int j = arr[i].length -1; j >= 0; j--) {
					arr[i][j] = k;
					k++;
				}
			}
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
