package com.my;

import java.util.Scanner;

/*��]
 *	Scanner Ŭ������ �̿��Ͽ� ��ȭ�� �Է¹޾Ƽ� �޷��� ��ȯ�ϴ� ���α׷��� �����Ͻÿ�.
 *	$1 = 1300������ ��
 *	��°��  
 *	��ȭ�Է� : 3900
 *	3900���� $3.0�޷��Դϴ�.
 */
public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double rate = 1300.0;
		System.out.print("��ȭ �Է� ");
		int won = sc.nextInt();
		double dollar = won / rate;

		System.out.printf("%d���� $%.1f�޷��Դϴ�", won, dollar);
		System.out.println(won + "���� $ " + dollar + "�޷��Դϴ�");
		sc.close();

	}
}
