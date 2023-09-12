package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 학생 3명에게 각각 국어, 영어, 수학 점수를 입력받아서 배열에 저장하고, 총점과 평균을 구하는 프로그램을 구현하시오
 * 단) 2차원 배열과 입력은 BufferedReader를 활용하여 구현
 * 위의 내용이 구현되었으면 석차를 구현하시오
 */
public class Main05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "국어", "영어", "수학" };
		int sub[][] = new int[3][subname.length + 1]; // 총점을 넣어야 해서 length +1 로 범위를 1 늘려준다.
		// [3] : 학생 수 , [subname.length + 1] : 과목 수, 총점

		float[] avg = new float[3];
		// 학생별 평균을 저장할 공간을 할당

		// 각 과목별 점수 입력
		for (int i = 0; i < sub.length; i++) { // 인원수
			for (int j = 0; j < sub[i].length - 1; j++) { // 과목별 점수
				do {
					System.out.print(subname[j] + " 점수 : ");
					sub[i][j] = Integer.parseInt(br.readLine());
				} while (sub[i][j] < 0 || sub[i][j] > 100);
				sub[i][sub[i].length - 1] += sub[i][j]; // 총점
			}
			avg[i] = sub[i][sub[i].length - 1] / (float) (sub[i].length - 1); // 평균
		}

		
		for (int i = 0; i < sub.length; i++) {
			System.out.println();
			System.out.println("총점 : " + sub[i][sub[i].length - 1]);
			System.out.println("평균 : " + avg[i]);
		}
		
		
	}
}
