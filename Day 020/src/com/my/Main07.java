package com.my;

public class Main07 {
	public static void main(String[] args) {
		String name = "Yoon GiYeong";
		int age = 29;
		char gender = 'M';
		String phone = "010-7204-7428";
		String address= "글로벌인";
		
		System.out.printf("이름 : %s%n", name);
		System.out.printf("나이 : %d%n", age);
		System.out.printf("성별 : %c%n", gender );
		System.out.printf("연락처 : %s%n", phone);
		System.out.printf("주소 : %s%n", address);
		
		System.out.printf("나의 이름은 %s이며, 나이는 방년 %d세이며\n",name,age);
		System.out.printf("성별은 %c이고 전화번ㄴ호는 %s",gender, phone);
		System.out.printf("이고\n 주소는 %s입니다.",address);
	}
}
