package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 성적관리 프로그램 구현
 * 배열을 활용하여 구현
 * 
 * 국어, 영어, 수학과목과 과목에 해당하는 점수를 입력받아 총점과 평균을 구하는 프로그램을 구현
 */
public class Main07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] sub = new int[4]; //국어, 영어, 수학, 총점
		//sub[0] = 국어, sub[1] = 영어, sub[2] = 수학, sub[3] = 총점
		float avg = 0.0f; //평균
		
		do {
			System.out.print("국어점수 : ");
			sub[0] = Integer.parseInt(br.readLine());
		}while(sub[0] < 0 || sub[0] > 100);
		
		do {
			System.out.print("영어점수 : ");
			sub[1] = Integer.parseInt(br.readLine());
		}while(sub[1] < 0 || sub[1] > 100);
		
		do {
			System.out.print("수학점수 : ");
			sub[2] = Integer.parseInt(br.readLine());
		}while(sub[2] < 0 || sub[2] > 100);
		
		sub[3] = sub[0] + sub[1] + sub[2]; // 총점
		avg = sub[3] / 3.0f;
		
		System.out.println();
		System.out.println("총점 : " + sub[3]);
		System.out.printf("평균 : %f%n ", avg);
	}
}
