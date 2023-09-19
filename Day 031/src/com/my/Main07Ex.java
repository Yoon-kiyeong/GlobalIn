package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main07Ex {
	public static void main(String[] args) throws IOException {
		Main07 ma = new Main07("이디엇");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strWork;
		do {
			System.out.println("작업 하실 업무를 선택하세요");
			System.out.println("---------------------------------------");
			System.out.println("1. 입금 2. 출금 3. 잔액조회 0. 종료");

			System.out.print("작업을 선택해주세요. : ");
			strWork = br.readLine();

			int swit = 0;
			if (strWork != null) {
				swit = Integer.parseInt(strWork);
			} else {
				System.out.print("작업을 선택해주세요. : ");
				System.exit(0);
			}

			switch (swit) {
			case 0:
				break;
			case 1:
				System.out.println("\n-------------------------------------");
				System.out.print("입금할 금액을 입력해 주세요 : ");
				String strdepositInt = br.readLine();
				long depositLong = Long.parseLong(strdepositInt);
				ma.deposit(depositLong);
				break;
			case 2:
				System.out.println("\n-------------------------------------");
				System.out.print("출금할 금액을 입력하세요 : ");
				String withdrawInt = br.readLine();
				long withdrawLong = Long.parseLong(withdrawInt);
				ma.withdraw(withdrawLong);
				break;
			case 3:
				System.out.println("\n-------------------------------------");
				System.out.println(ma.getName() + "님의 현재 금액은 " + ma.getBalance() + "원입니다");
				break;
			default:
				break;
			}

			System.out.println("---------------------------------------");
		} while (!strWork.equals("0"));

	}
}
