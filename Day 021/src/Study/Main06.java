package Study;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� ");
		int month = sc.nextInt();
		
		if (month >= 3 && month <= 5) {
			System.out.println("��");
		} else if (month >= 6 && month <= 8) {
			System.out.println("����");
		} else if (month >= 9 && month <= 11) {
			System.out.println("����");
		} else if (month == 1 || month == 2 || month == 12) {
			System.out.println("�ܿ�");
		} else {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�");
		}
	}
}
