package com.my;

import java.util.Scanner;

/*
 * ��� 5���� �Է¹޾� �迭�� �����ϰ�, ���� ū ���� ����ϴ� ���α׷��� �����Ͻÿ�
 */
public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���� 5���� �Է¹޾� ������ �迭�� ����
		int arr[] = new int[5];	//��� ����
	
		int max = arr[0];	//���� ���� ū ���� ������ ���� ���� �� �ʱ�ȭ
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();	//������ �Է�
			arr[i] = num;			//�Է¹��� �������� max�� ����Ǿ� �ִ� ���� ���Ͽ� �Է¹��� ���� �� ũ�� max�� �Է¹��� �������� �����Ѵ�.
			if (arr[i] > max) {		//arr[i]�� ���� ���� ū ������ ũ��
				max = arr[i];		//arr[i]���� max�� �����Ѵ�.
			}
		}
		System.out.println("�ִ� : " + max);
	}
}
