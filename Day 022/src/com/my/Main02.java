package com.my;

import java.io.*;
public class Main02 {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
	System.out.print("���� ���� : ");
	int kor = Integer.parseInt(br.readLine());

	System.out.print("���� ���� : ");
	int eng = Integer.parseInt(br.readLine());

	System.out.print("���� ���� : ");
	int math = Integer.parseInt(br.readLine());
	
	int sum = kor + eng + math;
	double avg = sum / 3.0;
	char grade;
	
	 System.out.printf("������ : " + sum + "���̸�, ����� : %.2f�Դϴ�.\n", avg);
	
	if (avg >= 90) {
		grade = 'A';
		System.out.println(grade);
	} else if (avg >= 80) {
		grade = 'B';
		System.out.println(grade);
	} else if (avg >= 70) {
		grade = 'C';
		System.out.println(grade);
	} else if (avg >= 60) {
		grade = 'D';
		System.out.println(grade);
	} else {
		grade = 'F';
		System.out.println(grade);
	}
}
}
