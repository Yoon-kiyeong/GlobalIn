package com.my;

import java.util.Scanner;

/*
 * Grade Ŭ������ �ۼ��Ͻÿ�
 * 3������ ������ �Է¹޾� Grade ��ü�� �����ϰ� ����� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 * 
 * ������ ������ ����.
 * Grade Ŭ������ int Ÿ���� mat, sci, eng �Ӽ��� private�� �����ϰ�, �����ڿ� �� ������ ����� �����ϴ� avg() �޼ҵ带 �ۼ��Ͻÿ�
 * 
 * 	public static void main(String[] args) {
 *  	Scanner sc = new Scanner(System.in);
 *  
 *  	System.out.print("����, ����, ��������� 3���� ���� �Է� :" );
 *  int mat = sc.nextInt();
 *  int sci = sc.nextInt();
 *  int eng = sc.nextInt();
 *  Grade me = new Grade(mat,sci, eng);
 *  System.out.print("�����" +  me.avg());
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
		
		System.out.print("����, ����, ��������� 3���� ���� �Է� : ");
		int mat = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		Grade me = new Grade(mat, sci, eng);
		System.out.printf("��տ� %.2f", me.avg());
		
	}
}
