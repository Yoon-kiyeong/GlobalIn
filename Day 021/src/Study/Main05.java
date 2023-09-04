package Study;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("층 수를 눌러주세요  ");
		int floor = sc.nextInt();
		
		switch(floor) {
		case 1:
			System.out.println(floor + "층 약국입니다.");
			break;
		case 2:
			System.out.println(floor + "층 정형외과입니다");
			break;
		case 3:
			System.out.println(floor + "층 피부과입니다");
			break;
		case 4:
			System.out.println(floor + "층 치과입니다");
			break;
		case 5:
			System.out.println(floor + "층 헬스클럽입니다");
			break;
		default:
			System.out.println("층을 잘못 입력하셨습니다");
		}
	}
}
