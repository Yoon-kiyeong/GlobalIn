package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "국어", "영어", "수학" };

		int sub[][] = new int[3][subname.length + 2];
		// 3: 학생 수 , subname.length + 1: 국어, 영어, 수학, 총점, 석차

		float[] avg = new float[3];
		// 학생별 평균을 저장할 공간할당

		// 각 과목별 점수입력
		for (int i = 0; i < sub.length; i++) {// 인원수
			for (int j = 0; j < sub[i].length - 2; j++) {// 과목별 점수

				do {
					System.out.print(subname[j] + "점수: ");
					sub[i][j] = Integer.parseInt(br.readLine());// 과목별 점수 입력
				} while (sub[i][j] < 0 || sub[i][j] > 100);// 점수의 범위는 0~100점으로 한다.

				sub[i][sub[i].length - 2] += sub[i][j]; // 총점
			}
			avg[i] = sub[i][sub[i].length - 2] / (float) sub[i].length - 2; // 평균
			sub[i][sub[i].length - 1] = 1;	//석차를 매기기 위해 1로 초기화
		}

		// 석차 구하기
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub.length; j++) {
				if (sub[i][sub[i].length - 2] < sub[j][sub[j].length - 2]) {
					sub[i][sub[i].length - 1]++;
				}
			}
		}

		// 총점과 평균 출력
		for (int i = 0; i < sub.length; i++) {// 인원수

			System.out.println();
			System.out.println("총점:" + sub[i][sub[i].length - 2]);
			System.out.println("평균:" + avg[i]);
			System.out.println("석차:" + sub[i][sub[i].length - 1] + "등");

		}

	}
}
