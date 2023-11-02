package com.test;

import java.util.Scanner;

class Player {
	Scanner sc = new Scanner(System.in);
	public String name;
	public String word;

	public String sayWord() {
		word = sc.next();
		return word;
	}

	public boolean succed(char last) {
		if (last == word.charAt(0))
			return true;
		else
			return false;
	}
}

public class WordGameApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "아버지";
		System.out.println("끝말잇기 게임을 시작합니다. ...");
		System.out.print("게임에 참가하는 인원 입력 >>");
		int num = sc.nextInt();

		Player[] play = new Player[num];
		for (int i = 0; i < play.length; i++) {
			System.out.print("참가자의 이름 >> ");
			play[i] = new Player();
			play[i].name = sc.next();
		}
		System.out.println("시작하는 단어는 아버지입니다.");

		int i = 0, j = 0;
		while (true) {
			j = i % num;
			int last = word.length() - 1;
			char lastChar = word.charAt(last);

			System.out.print(play[j].name + " >> ");
			play[j].sayWord();
			boolean continuin = play[j].succed(lastChar);
			if (continuin == false) {
				System.out.println(play[j].name + "이 졌습니다");
				break;
			}
			word = play[j].word;
			i++;
		}
	}
}
