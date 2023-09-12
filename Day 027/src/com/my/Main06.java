package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] subname = { "����", "����", "����" };

		int sub[][] = new int[3][subname.length + 2];
		// 3: �л� �� , subname.length + 1: ����, ����, ����, ����, ����

		float[] avg = new float[3];
		// �л��� ����� ������ �����Ҵ�

		// �� ���� �����Է�
		for (int i = 0; i < sub.length; i++) {// �ο���
			for (int j = 0; j < sub[i].length - 2; j++) {// ���� ����

				do {
					System.out.print(subname[j] + "����: ");
					sub[i][j] = Integer.parseInt(br.readLine());// ���� ���� �Է�
				} while (sub[i][j] < 0 || sub[i][j] > 100);// ������ ������ 0~100������ �Ѵ�.

				sub[i][sub[i].length - 2] += sub[i][j]; // ����
			}
			avg[i] = sub[i][sub[i].length - 2] / (float) sub[i].length - 2; // ���
			sub[i][sub[i].length - 1] = 1;	//������ �ű�� ���� 1�� �ʱ�ȭ
		}

		// ���� ���ϱ�
		for (int i = 0; i < sub.length; i++) {
			for (int j = 0; j < sub.length; j++) {
				if (sub[i][sub[i].length - 2] < sub[j][sub[j].length - 2]) {
					sub[i][sub[i].length - 1]++;
				}
			}
		}

		// ������ ��� ���
		for (int i = 0; i < sub.length; i++) {// �ο���

			System.out.println();
			System.out.println("����:" + sub[i][sub[i].length - 2]);
			System.out.println("���:" + avg[i]);
			System.out.println("����:" + sub[i][sub[i].length - 1] + "��");

		}

	}
}
