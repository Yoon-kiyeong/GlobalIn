package Study;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Main04 student1 = new Main04("ȫ�浿", 20, 175, 70, "2023-09-15", 1, 4.5);
		Main04 student2 = new Main04("ȫ�浿", 30, 175, 70, "2023-09-15", 1, 4.5);
		Main06 teacher1 = new Main06("������", 36, 168, 77, "2023-09-15", 300000, 5);
		student1.show();
		student2.show();
		teacher1.shwo();
		Main04[] students = new Main04[100];
		for (int i = 0; i < 100; i++) {
			students[i] = new Main04("ȫ�浿", 20, 175, 70, i + "", 1, 4.5);
			students[i].show();
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("�� ����� �л��� �����մϱ�? ");
		int number = sc.nextInt();
		Main04[] student = new Main04[number];
		for (int i = 0; i < number; i++) {
			String name;
			int age; 
			int weight;
			int height;
			String studentID;
			int grade;
			double gPA;
			
			System.out.print("�л��� �̸��� �Է��ϼ��� ");
			name = sc.next();
			
			System.out.print("�л��� ���̸� �Է��ϼ��� ");
			age = sc.nextInt();
			
			System.out.print("�л��� Ű�� �Է��ϼ��� ");
			weight = sc.nextInt();
			
			System.out.print("�л��� �����Ը� �Է��ϼ��� ");
			height = sc.nextInt();
			
			System.out.print("�л��� �й��� �Է��ϼ��� ");
			studentID = sc.next();
			
			System.out.print("�л��� �г��� �Է��ϼ��� ");
			grade = sc.nextInt();
			
			System.out.print("�л��� ������ �Է��ϼ��� ");
			gPA = sc.nextDouble();
			
			student[i] = new Main04(name, age, weight, height, studentID, grade, gPA);
		}
		
		for(int i = 0; i < number; i++) {
			student[i].show();
		}
	}
}
