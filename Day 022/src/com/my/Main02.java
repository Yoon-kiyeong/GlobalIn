package com.my;

import java.io.*;
public class Main02 {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
	System.out.print("국어 점수 : ");
	int kor = Integer.parseInt(br.readLine());

	System.out.print("영어 점수 : ");
	int eng = Integer.parseInt(br.readLine());

	System.out.print("수학 점수 : ");
	int math = Integer.parseInt(br.readLine());
	
	int sum = kor + eng + math;
	double avg = sum / 3.0;
	char grade;
	
	 System.out.printf("총점은 : " + sum + "점이며, 평균은 : %.2f입니다.\n", avg);
	
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
