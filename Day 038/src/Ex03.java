import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� : ");
		int day = sc.nextInt();

		if (day >= 1 && day <= 31) {
			switch (day % 7) {
			case 0:
				System.out.println("�Ͽ���");
				break;
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("ȭ����");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("�����");
				break;
			case 5:
				System.out.println("�ݿ���");
				break;
			case 6:
				System.out.println("�����");
				break;
			default:
				System.out.println("1���� 31�� ������ ���ڸ� �Է����ּ���");
			}
		}
	}
}
