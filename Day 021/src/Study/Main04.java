package Study;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("month : ");
		int month = sc.nextInt();
		int day;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			System.out.println("day = " + day);
			break;
		case 2:
			day = 28;
			System.out.println("day = " + day);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			System.out.println("day = " + day);
			break;
		default:
			System.out.println("월을 잘못 입력하셨습니다.");
		}
	}
}
