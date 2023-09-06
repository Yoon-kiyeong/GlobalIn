package com.my;
/*
 * 두 사람이 하는 가위 바위 보 게임을 만들기
 * 먼저 철수가 가위, 바위, 보 중 하나를 문자열로 입력받고
 * 영희도 마찬가지로 입력받는다.
 * 입력받은 문자열을 비교하여 누가 이겼는지를 판별하는 프로그램을 구현하시오
 */
import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String chul;
		String yeong;
		
		System.out.print("철수 : ");
		chul = sc.next();
		System.out.print("영희 : ");
		yeong = sc.next();
		
		if((chul.equals("가위") && yeong.equals("보")) || (chul.equals("바위") && yeong.equals("가위")) || (chul.equals("보") && yeong.equals("바위"))) {
			System.out.println("철수가 이겼습니다.");
		} else if((yeong.equals("가위") && chul.equals("보")) || (yeong.equals("바위") && chul.equals("가위")) || (yeong.equals("보") && chul.equals("바위"))) {
			System.out.println("영희가 이겼습니다.");
		} else if((chul.equals("가위") && yeong.equals("가위")) || (chul.equals("바위") && yeong.equals("바위")) || (chul.equals("보") && yeong.equals("보"))) {
			System.out.println("비겼습니다.");
		}
	}
}
