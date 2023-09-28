import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("일자를 입력하세요 : ");
		int day = sc.nextInt();

		if (day >= 1 && day <= 31) {
			switch (day % 7) {
			case 0:
				System.out.println("일요일");
				break;
			case 1:
				System.out.println("월요일");
				break;
			case 2:
				System.out.println("화요일");
				break;
			case 3:
				System.out.println("수요일");
				break;
			case 4:
				System.out.println("목요일");
				break;
			case 5:
				System.out.println("금요일");
				break;
			case 6:
				System.out.println("토요일");
				break;
			default:
				System.out.println("1부터 31일 까지의 숫자를 입력해주세요");
			}
		}
	}
}
