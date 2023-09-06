package com.my;

import java.util.Scanner;

/*
 * 2차원 평면에서 직사각형은 Main01과 같다.
 * 직사각형을 구성하는 두점(x1,y1),(x2,y2)를 입력받아 (100,100),(200,200)의 두 점으로
 * 이루어진 직사각형과 충돌하는지를 판별하는 프로그램을 구현하시오
 * 단, if문과 논리연산자 활용
 * 
 * 이 문제 풀이에 아래의 메소드를 활용하시오
 * public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
    if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
        return true;
     else
        return false;
}
 */

public class Main02 {
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) {
		if ((x >= rectx1 && x <= recty1) && (y >= rectx2 && y <= recty2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("x1, x2의 좌표 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("y1, y2의 좌표 : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		boolean a = inRect(x1,x2,100,100,200,200);
		boolean b = inRect(y1,y2,100,100,200,200);
		
		if(a == true || b == true) {
			System.out.println("사각형이 겹칩니다.");
		} else {
			System.out.println("사각형이 겹치지 않습니다.");
		}
		
		sc.close();
	}
}
