package com.my;

/*
 * 2���� �迭�� �̿��Ͽ� �г⺰�� 1, 2�б� �������� �����ϰ�. 4�Ⱓ ��ü ������ ����� ���ϴ� ���α׷��� �����Ͻÿ�
 */
public class Main07 {
	public static void main(String[] args) {
		double arr[][] = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };

		double sum = 0;
		float average = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		average = (float)sum / (float) count;
		System.out.println("���� : " + sum);
		System.out.printf("4�� ��ü ���� ����� %.4f", average);
	}
}
