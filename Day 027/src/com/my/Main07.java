package com.my;

/*
 * 2차원 배열을 이용하여 학년별로 1, 2학기 성적으로 저장하고. 4년간 전체 평점의 평균을 구하는 프로그램을 구현하시오
 */
public class Main07 {
	public static void main(String[] args) {
		double arr[][] = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };

		double sum = 0;
		float average = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		average = (float)sum / (float) count;
		System.out.println("총합 : " + sum);
		System.out.printf("4년 전체 평점 평균은 %.4f", average);
	}
}
