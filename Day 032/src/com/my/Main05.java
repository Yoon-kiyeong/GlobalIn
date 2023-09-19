package com.my;

import java.util.Scanner;

/*
 * Circle 클래스와 CircleManager 클래스를 완성하시오
 * 
 * 3개의 Circle 객체배열을 만들고 x,y,r 값을 얻어
 * 3개의 Circle 객체를 만들고 show()를 통해 출력하시오
 */

class Circle {
	private double x, y;
	private int r;

	public Circle(double x, double y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + r);
	}
}

public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, r  : ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int r = sc.nextInt();
			c[i] = new Circle(x, y, r);
		}
		for (int i = 0; i < c.length; i++) {
			c[i].show();
		}
	}
}
