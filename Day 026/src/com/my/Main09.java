package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "��������", "��������", "��������" }; // ����, ����, ����, ����

		int sub[] = new int[subname.length + 1]; // 4

		float avg = 0.0f; // ���

		for (int i = 0; i < sub.length -1; i++) {
			do {
				System.out.print(subname[i] + " : ");
				sub[i] = Integer.parseInt(br.readLine());
			} while (sub[0] < 0 || sub[0] > 100);
		}

		sub[subname.length] = sub[0] + sub[1] + sub[2];
		avg = sub[subname.length - 1] / (float) subname.length;

		System.out.println("���� : " + sub[subname.length]);
		System.out.printf("��� : %f%n ", avg);
	}
}