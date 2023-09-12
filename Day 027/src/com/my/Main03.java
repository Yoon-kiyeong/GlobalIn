package com.my;
/* 다차원 배열
 * 
 * 다차원 배열 선언
 * 	1. 자료형[][] 배열명;
 *  2. 자료형 배열명[][];
 *  3. 자료형[] 배열명[];
 *  
 *  초기와
 *  	1. 배열명 = new 자료형[row][coluimn]; --> 정형배열
 *  	2. 배열명 자료형[row][] -> 비정형, 가변배열, 래기드 배열
 *  	3. 배열명 = {
 *  				{1,2}, --> 첫번째 행
 *  				{3,4}, --> 첫번째 행
 *  				-> 행을 구분할 때는 콤마로 구분함(,) ...};
 * 
 */
public class Main03 {
	public static void main(String[] args) {
		//배열 선언
		int[][] test;
		
		//배열 초기화
		test = new int[2][3];
		
		//첫번째 행 시작
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		//첫번재 행 끝
		
		//두번째 행 시작
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		//두번째 행 끝

		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(test[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
