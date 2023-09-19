package com.my;
/*
 * 이름, 전화번호 필드와 생성자 등을 가진 Phone 클래스를 작성하고,
 * 다음과 같이 구현되도록 PhoneBook 클래스를 구현하시오
 * 
 * 인원수:3
 * 이름과 전화번호 (이름과 번호는 빈칸없이 입력) : 가길동 777-7777
 * 이름과 전화번호 (이름과 번호는 빈칸없이 입력) : 나길동 888-8888
 * 이름과 전화번호 (이름과 번호는 빈칸없이 입력) : 다길동 999-9999
 * 저장되었습니다...
 * 검색할 이름 : 홍길동
 * 홍길동이 없습니다
 * 검색할 이름 : 다길동
 * 다길동의 번호는 999-9999
 * 검색할 이름 : 그만 -> 그만을 입력하면 프로그램을 종료
 * 
 * 문자열을 비교할 때는 equals() 메소드 활용
 * 
 */

import java.util.Scanner;

class Phone {
	String name;
	String tel;

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

class PhoneBook {

	private Scanner sc;
	private Phone[] phoneBooks;

	public PhoneBook() {
		sc = new Scanner(System.in);

	}

	public void read() {
		System.out.print("인원수 : ");
		int num = sc.nextInt();
		phoneBooks = new Phone[num];

		for (int i = 0; i < phoneBooks.length; i++) {
			System.out.print("이름과 전화번호 (이름과 번호는 빈칸없이 입력) : ");
			String name = sc.next();
			String tel = sc.next();
			phoneBooks[i] = new Phone(name, tel);
		}
	}
	
	public String search(String name) {
		for(int i = 0; i < phoneBooks.length; i++) {
			if(phoneBooks[i].getName().equals(name)) {
				return phoneBooks[i].getTel();
			}
		}
		return null;
	}
	
	public void run() {
		read();
		while(true) {
			System.out.print("검색할 이름 입력 : ");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			String tel = search(name);
			if(tel == null) {
				System.out.println(name + "이 없습니다");
			} else {
				System.out.println(name + "의 번호는 " + tel + "입니다");
			}
		}
	}
}

public class Main07 {
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.run();
	}
}
