package com.my;
/*
 * Dictionary 클래스가 있다. 아래의 실행결과와 같이 구현될 수 있도록 클래스의 kor2Eng()메소드와 DicApp 클래스를 구현하시오
 * 
 * 실행결과
 * 
 * 한영 단어 검색 프로그램입니다
 * 한글 단어 : 희망
 * 희망은 hope
 * 한글 단어 : 아가
 * 아가는 저희 사전에 없습니다
 * 한글 단어 : 아기
 * 아기는 baby
 * 한글 단어: 그만을 입력하면 프로그램 종료
 */

import java.util.Scanner;

class Dictionary {
	private static String kor[] = { "사랑", "아기", "돈", "미래", "희망" };
	private static String eng[] = { "love", "baby", "money", "future", "hope" };

	public static String[] getKor() {
		return kor;
	}

	public static void setKor(String[] kor) {
		Dictionary.kor = kor;
	}

	public static String[] getEng() {
		return eng;
	}

	public static void setEng(String[] eng) {
		Dictionary.eng = eng;
	}

	public Dictionary(String kor[], String eng[]) {
		this.kor = kor;
		this.eng = eng;
	}

	public Dictionary() {
	}

	Scanner sc = new Scanner(System.in);

	public static String kor2Eng(String word) {
		int cnt = 0;
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				return eng[cnt];
			}
			cnt++;
		}
		return null;
	}

	public void run() {
		System.out.println("한글 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글 단어 : ");
			String word = sc.next();
			if (word.equals("그만")) {
				break;
			}
			if (kor2Eng(word) == null) {
				System.out.println(word + "이 없습니다");
			} else {
				System.out.println(word + "는(은) " + kor2Eng(word));
			}
		}
	}
}

public class Main02 {
	public static void main(String[] args) {
		Dictionary d = new Dictionary();
		d.run();
	}

}
