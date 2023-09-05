package com.my;

import java.util.Scanner;

/*문]
 *	Scanner 클래스를 이용하여 원화를 입력받아서 달러로 변환하는 프로그램을 구현하시오.
 *	$1 = 1300원으로 함
 *	출력결과  
 *	원화입력 : 3900
 *	3900원은 $3.0달러입니다.
 */
public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double rate = 1300.0;
		System.out.print("원화 입력 ");
		int won = sc.nextInt();
		double dollar = won / rate;

		System.out.printf("%d원은 $%.1f달러입니다", won, dollar);
		System.out.println(won + "원은 $ " + dollar + "달러입니다");
		sc.close();

	}
}
