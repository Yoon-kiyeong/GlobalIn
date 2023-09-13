package com.my;

import java.util.Random;
import java.util.Scanner;

/*
 * 사용자로부터 입력받은 변수의 개수만큼
 * 난수를 발생시켜 배열에 저장하고, 배열에 저장된 값들 중 가장 큰 값과 작은 값을 출력하는 프로그램을 구현
 */
public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		System.out.print("발생시킬 난수의 개수 입력 : ");
		num = sc.nextInt();

		int arr[] = new int[num];

		Random random = new Random();

		// Random객체로 난수 추출
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45 + 1);
			System.out.printf("%4d", arr[i]);
		}

		// Math.random으로 난수 추출
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.printf("%4d", arr[i]);
		}

		System.out.println();

		int max, min;
		max = min = arr[0];

		//최댓값, 최솟값 검사하는 for문
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) //arr[i]의 값이 max보다 클 경우
				max = arr[i]; //max = arr[i]의 값이 됨
			if (arr[i] < min) //arr[i]의 값이 min 보다 작을 경우
				min = arr[i]; //min = arr[i]의 값이 됨
		}
		
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
}
