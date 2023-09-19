package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main07Ex {
	public static void main(String[] args) throws IOException {
		Main07 ma = new Main07("�̵��");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strWork;
		do {
			System.out.println("�۾� �Ͻ� ������ �����ϼ���");
			System.out.println("---------------------------------------");
			System.out.println("1. �Ա� 2. ��� 3. �ܾ���ȸ 0. ����");

			System.out.print("�۾��� �������ּ���. : ");
			strWork = br.readLine();

			int swit = 0;
			if (strWork != null) {
				swit = Integer.parseInt(strWork);
			} else {
				System.out.print("�۾��� �������ּ���. : ");
				System.exit(0);
			}

			switch (swit) {
			case 0:
				break;
			case 1:
				System.out.println("\n-------------------------------------");
				System.out.print("�Ա��� �ݾ��� �Է��� �ּ��� : ");
				String strdepositInt = br.readLine();
				long depositLong = Long.parseLong(strdepositInt);
				ma.deposit(depositLong);
				break;
			case 2:
				System.out.println("\n-------------------------------------");
				System.out.print("����� �ݾ��� �Է��ϼ��� : ");
				String withdrawInt = br.readLine();
				long withdrawLong = Long.parseLong(withdrawInt);
				ma.withdraw(withdrawLong);
				break;
			case 3:
				System.out.println("\n-------------------------------------");
				System.out.println(ma.getName() + "���� ���� �ݾ��� " + ma.getBalance() + "���Դϴ�");
				break;
			default:
				break;
			}

			System.out.println("---------------------------------------");
		} while (!strWork.equals("0"));

	}
}
