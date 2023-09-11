package com.my;

import java.util.Scanner;

/*
 * 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 구현하시오
 */
public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수 5개를 입력받아 저장할 배열을 선언
		int arr[] = new int[5];	//뱅려 생성
	
		int max = arr[0];	//현재 가장 큰 수를 저장할 변수 선언 및 초기화
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();	//정수값 입력
			arr[i] = num;			//입력받은 정수값과 max에 저장되어 있는 값과 비교하여 입력받은 값이 더 크면 max에 입력받은 정수값을 저장한다.
			if (arr[i] > max) {		//arr[i]가 현재 가장 큰 값보다 크면
				max = arr[i];		//arr[i]값을 max에 저장한다.
			}
		}
		System.out.println("최댓값 : " + max);
	}
}
