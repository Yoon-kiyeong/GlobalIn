package com.my;

import java.util.Scanner;

/* 중첩 if문
 * 
 * 문) 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력한다.
 * 단, 4학년일 경우 70점 이상이어야만 합격이다. (학년은 1학년부터 4학년까지로 가정한다)
 * 
 * 
 */
public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 : ");
		int score = sc.nextInt();
		System.out.print("학년 : ");
		int grade = sc.nextInt();

//		if ((score >= 60 && grade < 4) || (score >= 70 && grade == 4)) {
//			System.out.println("합격입니다.");
//		} else if ((score > 101) || (grade > 4)) {
//			System.out.println("점수 혹은 학년 입력이 잘못되었습니다");
//		} else {
//			System.out.println("불합격입니다.");
//		}

		if (score >= 60) {
			if (grade != 4) {
				System.out.println("합격입니다");
			} else if (score >= 70) {
				System.out.println("합격입니다");
			} else {
				System.out.println("불합격입니다.");
			}
		}
	}
}
