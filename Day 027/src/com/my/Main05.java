package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �л� 3���� ���� ����, ����, ���� ������ �Է¹޾Ƽ� �迭�� �����ϰ�, ������ ����� ���ϴ� ���α׷��� �����Ͻÿ�
 * ��) 2���� �迭�� �Է��� BufferedReader�� Ȱ���Ͽ� ����
 * ���� ������ �����Ǿ����� ������ �����Ͻÿ�
 */
public class Main05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "����", "����", "����" };
		int sub[][] = new int[3][subname.length + 1]; // ������ �־�� �ؼ� length +1 �� ������ 1 �÷��ش�.
		// [3] : �л� �� , [subname.length + 1] : ���� ��, ����

		float[] avg = new float[3];
		// �л��� ����� ������ ������ �Ҵ�

		// �� ���� ���� �Է�
		for (int i = 0; i < sub.length; i++) { // �ο���
			for (int j = 0; j < sub[i].length - 1; j++) { // ���� ����
				do {
					System.out.print(subname[j] + " ���� : ");
					sub[i][j] = Integer.parseInt(br.readLine());
				} while (sub[i][j] < 0 || sub[i][j] > 100);
				sub[i][sub[i].length - 1] += sub[i][j]; // ����
			}
			avg[i] = sub[i][sub[i].length - 1] / (float) (sub[i].length - 1); // ���
		}

		
		for (int i = 0; i < sub.length; i++) {
			System.out.println();
			System.out.println("���� : " + sub[i][sub[i].length - 1]);
			System.out.println("��� : " + avg[i]);
		}
		
		
	}
}
