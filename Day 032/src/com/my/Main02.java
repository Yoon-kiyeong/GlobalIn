package com.my;

import java.util.Scanner;

/*
 * Grade 클래스를 작성하시오
 * 3과목을 점수를 입력받아 Grade 객체를 생성하고 평균을 구하여 출력하는 프로그램을 작성하시오
 * 
 * 조건은 다음과 같다.
 * Grade 클래스에 int 타입의 mat, sci, eng 속성을 private로 선언하고, 생성자와 세 과목의 평균을 리턴하는 avg() 메소드를 작성하시오
 * 
 * 	public static void main(String[] args) {
 *  	Scanner sc = new Scanner(System.in);
 *  
 *  	System.out.print("수학, 과학, 영어순으로 3개의 점수 입력 :" );
 *  int mat = sc.nextInt();
 *  int sci = sc.nextInt();
 *  int eng = sc.nextInt();
 *  Grade me = new Grade(mat,sci, eng);
 *  System.out.print("평균은" +  me.avg());
 */

class Grade {
	private int mat;
	private int sci;
	private int eng;
	
	public Grade() {}
	
	public Grade(int mat, int sci, int eng) {
		this.eng = eng;
		this.sci = sci;
		this.mat = mat;
	}

	public float avg() {
		int sum = mat + sci + eng;
		return sum / 3.0f;
		
	}
}

public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어순으로 3개의 점수 입력 : ");
		int mat = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		Grade me = new Grade(mat, sci, eng);
		System.out.printf("평균운 %.2f", me.avg());
		
	}
}
