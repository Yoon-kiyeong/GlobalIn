package com.my;

public class Main01 {
	public static void main(String[] args) {
		// 객체배열 선언
		Diagram dia[] = new Diagram[3];

		dia[0] = new Triangle();
		dia[1] = new Circle();
		dia[2] = new RectAngle();

		for (int i = 0; i < dia.length; i++) {
			dia[i].draw();
		}
	}
}
