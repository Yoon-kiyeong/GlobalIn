package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * switch문
 * 	1. 다양한 처리문을 두고 조건값에 의해 하나의 처리문이나 여러 개의 처리문을 한번에 수행하는데 아주 유용한 빅문임
 * 	2. if문은 조건값이 boolean형이지만, switch문은 정수형과 문자열임
 * 	3. break문은 하나의 조건값마다 하나의 수행문만 필요할 경우 사용한다.
 * 	     단, break문이 없을 경우 다음 break문을 만날때까지 계속 수행함
 *  4. 인자값과 비교값 1,2,3이 모두 일치하지 않을 경우 default문을 수행함
 *  5. 주의 할 점은 casㄷ 뒤에 오는 조건값이 중복되지 않아야함
 */
public class Main05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어점수 입력 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수 입력 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수 입력 : ");
		int math = Integer.parseInt(br.readLine());

		int sum = kor + eng + math;
		int avg = (sum / 3);
		System.out.printf("총점 : %d, 평균 : %d\n", sum, avg);
		avg = (sum / 3) / 10;
		switch (avg) {
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