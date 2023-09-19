package com.my;

/*
 * 다음 속성을 가지고 직사각형을 표현하는 Retangle 클래스를 구현하시오
 * int형의 x, y, width height 필드 : 사각형을 구성하는 점과 크기
 * x, y, width, height 속성값을 매개변수로 받아 멤버필드를 초기화하는 생성자
 * int square() : 사각형의 넓이를 리턴하는 메소드
 * void show : 사각형의 좌표의 넓이를 화면에 출력
 * boolean contains(Rectangle r) : 매개변수로 받은 r이 한 사각형 안에 있으면 true 리턴, 없으면 false 리턴
 * 
 * main() 메소드
 * Rectangle r = new Rectangle(2,2,8,7);
 * Rectangle s = new Rectangle(5,5,6,6);
 * Rectangle t = new Rectangle(1,1,10,10);
 * 
 * r.show();
 * System.out.println("s의 면적은 " + s.square());
 * if(t.contains(r)) System.out.println("t는 r을 포함합니다);
 * if(t.contains(s)) System.out.println("t는 s를 포함합니다);
 * 
 *  실행 결과
 *  (2,2)에서 크기가 8X7인 사각형
 *  s의 면적은 36
 *  t는 r을 포함한다
 *   */

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return width * height;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "X" + height + "인 사각형");
	}

	public boolean contains(Rectangle r) {
//		if((r.x >= this.x && r.y >= this.y) || (r.x + r.width) >= ( this.x + this.width) && (r.y + r.height) >= (this.y + this.height)) {
		//   2   >=   1       2  >=  1           2 + 8 = 10    >=    1 + 10 == 11              2 + 7 = 9     >=       1 + 10 = 11
//			return true;
//		} else {
//			return false;
//		}
		
		if(x < r.x && y < r.y && x + width > r.x + r.width && y + height > r.y + r.height)
			return true;
		else
			return false;
	}
}

public class Main04 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은" + s.square());
		if(t.contains(r)) 
			System.out.println("t는 r을 포함합니다");
		if(t.contains(s)) 
			System.out.println("t는 s를 포함합니다");
	}
}
