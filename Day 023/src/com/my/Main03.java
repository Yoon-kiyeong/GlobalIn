package com.my;

import java.util.Scanner;
/*
 * 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 그리고 실수 값으로 다른 점 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
 */
public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 점 x,y
		System.out.print("점 x : ");
		int x = sc.nextInt();
		System.out.print("점 y : ");
		int y = sc.nextInt();
		
		// 원의 중심
		System.out.print("원 r_x : ");
		int r_x = sc.nextInt();
		System.out.print("원 r_y : ");
		int r_y = sc.nextInt();
		// 반지름
		System.out.print("반지름 r : ");
		double r = sc.nextDouble();
		
		double distance = Math.sqrt(((x-r_x)*(x-r_x))+((y-r_y)*(y-r_y)));
		
		if(distance < r) {
			System.out.println("점 x " + x + ", y " + y + "는 원 안에 있다.");
		} else {
			System.out.println("점 x " + x + ", y " + y + "는 원 안에 없다.");
		}
	}
}
