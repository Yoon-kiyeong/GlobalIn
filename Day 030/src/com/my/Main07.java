package com.my;

import java.util.Scanner;

public class Main07 {

	public static int getInt(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str + " : ");
		int score = sc.nextInt();
		return score;
	}

	public static void main(String[] args) {
		int kor = getInt("국어 점수");
		System.out.println("국어 점수는 : " + kor + "점입니다");
	}
}
