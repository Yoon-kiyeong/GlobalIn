package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "��������", "��������", "��������" }; // ����, ����, ����, ����

		int sub[] = new int[subname.length + 1]; //4

		float avg = 0.0f; // ���

		do {
			System.out.print(subname[0] + " : ");
			sub[0] = Integer.parseInt(br.readLine());
		} while (sub[0] < 0 || sub[0] > 100);

		do {
			System.out.print(subname[1] + " : ");
			sub[1] = Integer.parseInt(br.readLine());
		} while (sub[1] < 0 || sub[1] > 100);

		do {
			System.out.print(subname[2] + " : ");
			sub[2] = Integer.parseInt(br.readLine());
		} while (sub[2] < 0 || sub[2] > 100);
		
		sub[subname.length -1] = sub[0] + sub[1] + sub[2];
		avg = sub[subname.length -1] /(float)subname.length;
		
		System.out.println("���� : " + sub[subname.length -1]);
		System.out.printf("��� : %f%n ", avg);
	}
}
