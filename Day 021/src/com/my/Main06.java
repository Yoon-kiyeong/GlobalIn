package com.my;

/* �� ������ ������ �Է¹ް�, ��ð�, ���, ���������� ����ϴ� ���α׷��� �����Ͻÿ�
 * ex) 5000(�ʴ���) 
 * �� = (5000 / 60) / 60
 * �� = (5000 / 60) % 60
 * �� = (5000 % 60)
*/

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time, hour, minute, seconds;
		
		System.out.println("������ ������ �Է��ϼ��� : ");
		time = sc.nextInt();
		
		hour = (time / 60) / 60;	//60���� ���� ���� �ٽ� 60���� ���� ���� �ð�
		minute = (time / 60) % 60;	//60���� ���� ���� �ٽ� 60���� ���� �������� ��
		seconds = (time % 60);		//60���� ���� �������� ��
		
		System.out.println(time + "�ʴ� " +hour + "�ð� " + minute + "�� " + seconds + "�� �Դϴ�.");
	}
}
