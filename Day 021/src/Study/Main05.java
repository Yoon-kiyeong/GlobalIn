package Study;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �����ּ���  ");
		int floor = sc.nextInt();
		
		switch(floor) {
		case 1:
			System.out.println(floor + "�� �౹�Դϴ�.");
			break;
		case 2:
			System.out.println(floor + "�� �����ܰ��Դϴ�");
			break;
		case 3:
			System.out.println(floor + "�� �Ǻΰ��Դϴ�");
			break;
		case 4:
			System.out.println(floor + "�� ġ���Դϴ�");
			break;
		case 5:
			System.out.println(floor + "�� �ｺŬ���Դϴ�");
			break;
		default:
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�");
		}
	}
}
