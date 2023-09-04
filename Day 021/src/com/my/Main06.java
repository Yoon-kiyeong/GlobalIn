package com.my;

/* 초 단위로 정수를 입력받고, 몇시간, 몇분, 몇초인지를 출력하는 프로그램을 구현하시오
 * ex) 5000(초단위) 
 * 시 = (5000 / 60) / 60
 * 분 = (5000 / 60) % 60
 * 초 = (5000 % 60)
*/

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time, hour, minute, seconds;
		
		System.out.println("임의의 정수를 입력하세요 : ");
		time = sc.nextInt();
		
		hour = (time / 60) / 60;	//60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		minute = (time / 60) % 60;	//60으로 나눈 몫을 다시 60으로 나눈 나머지를 분
		seconds = (time % 60);		//60으로 나눈 나머지는 초
		
		System.out.println(time + "초는 " +hour + "시간 " + minute + "분 " + seconds + "초 입니다.");
	}
}
