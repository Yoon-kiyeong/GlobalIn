package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �������� ���α׷� ����
 * �迭�� Ȱ���Ͽ� ����
 * 
 * ����, ����, ���а���� ���� �ش��ϴ� ������ �Է¹޾� ������ ����� ���ϴ� ���α׷��� ����
 */
public class Main07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] sub = new int[4]; //����, ����, ����, ����
		//sub[0] = ����, sub[1] = ����, sub[2] = ����, sub[3] = ����
		float avg = 0.0f; //���
		
		do {
			System.out.print("�������� : ");
			sub[0] = Integer.parseInt(br.readLine());
		}while(sub[0] < 0 || sub[0] > 100);
		
		do {
			System.out.print("�������� : ");
			sub[1] = Integer.parseInt(br.readLine());
		}while(sub[1] < 0 || sub[1] > 100);
		
		do {
			System.out.print("�������� : ");
			sub[2] = Integer.parseInt(br.readLine());
		}while(sub[2] < 0 || sub[2] > 100);
		
		sub[3] = sub[0] + sub[1] + sub[2]; // ����
		avg = sub[3] / 3.0f;
		
		System.out.println();
		System.out.println("���� : " + sub[3]);
		System.out.printf("��� : %f%n ", avg);
	}
}
