package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "국어점수", "영어점수", "수학점수" }; // 국어, 영어, 수학, 총점

		int sub[] = new int[subname.length + 1]; // 4

		float avg = 0.0f; // 경균

		for (int i = 0; i < sub.length -1; i++) {
			do {
				System.out.print(subname[i] + " : ");
				sub[i] = Integer.parseInt(br.readLine());
			} while (sub[0] < 0 || sub[0] > 100);
		}

		sub[subname.length] = sub[0] + sub[1] + sub[2];
		avg = sub[subname.length - 1] / (float) subname.length;

		System.out.println("총점 : " + sub[subname.length]);
		System.out.printf("평균 : %f%n ", avg);
	}
}