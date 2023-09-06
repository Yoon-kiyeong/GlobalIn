package com.my;
/*
 * 문]
 * 	2차원 평면에서 직사각형은 왼쪽 상단 모서리와 하단 오른쪽 모서리의 두 점으로 표현한다.
 * (100,100)과 (200,200)의 두 점으로 이루어진 사각형이 있을 때, Scanner를 이용하여 정수 x와 y의 값을 입력받고 점(x,y)가 이 사각형 안에 있는지를 판별하는 프로그램을 구현하시오
 * 단, if문과 논리연산자를 활용
 */
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((100 <= x && x <= 200) && (100 <= y && y <= 200)) {
			System.out.println("x와 y는 사각형 안에 있습니다");
		} else {
			System.out.println("x와 y는 사각형 안에 없습니다.");
		}
		sc.close();
	}
}
