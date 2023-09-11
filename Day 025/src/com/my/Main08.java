package com.my;

import java.util.Scanner;

/* 문
 * 	국, 영, 수학 점수를 입력받아 총점과 평균을 구하고, 학점을 판정하는 프로그을 구현하시오
 * A,B,C,D,F 학점 판정(do ~ while)
 * 단, 각 과목의 범위는 100점을 벗어날 수 없다.
 * 만약 범위를 벗어났을 경우 다시 입력받도록 구한다.
 * 
 */
public class Main08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor, eng, math = 0;

		do {
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
		} while (0 > kor || kor > 100);

		do {
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
		} while (0 > eng || eng > 100);

		do {
			System.out.print("수학 점수 : ");
			math = sc.nextInt();
		} while (0 > math || math > 100);

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		switch ((int) avg / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}
