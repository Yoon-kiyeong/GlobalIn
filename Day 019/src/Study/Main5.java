package Study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);	// �ֿܼ� �Է��ϴ� ������
//		System.out.println("������ �Է��ϼ���");
//		int i = sc.nextInt();
//		System.out.println("�Էµ� ������ " + i + "�Դϴ�");
//		sc.close();

		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file); //������ �������� �ʰų� �о�� �� ���� �� ���� �߻���
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ �о���� ���߿� ������ �߻��߽��ϴ�");
			e.printStackTrace();
		} 
	}
}
