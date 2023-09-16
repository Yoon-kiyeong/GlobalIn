package Study;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Main04 student1 = new Main04("홍길동", 20, 175, 70, "2023-09-15", 1, 4.5);
		Main04 student2 = new Main04("홍길동", 30, 175, 70, "2023-09-15", 1, 4.5);
		Main06 teacher1 = new Main06("옥냥이", 36, 168, 77, "2023-09-15", 300000, 5);
		student1.show();
		student2.show();
		teacher1.shwo();
		Main04[] students = new Main04[100];
		for (int i = 0; i < 100; i++) {
			students[i] = new Main04("홍길동", 20, 175, 70, i + "", 1, 4.5);
			students[i].show();
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("총 몇명의 학생이 존재합니까? ");
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
			
			System.out.print("학생의 이름을 입력하세요 ");
			name = sc.next();
			
			System.out.print("학생의 나이를 입력하세요 ");
			age = sc.nextInt();
			
			System.out.print("학생의 키를 입력하세요 ");
			weight = sc.nextInt();
			
			System.out.print("학생의 몸무게를 입력하세요 ");
			height = sc.nextInt();
			
			System.out.print("학생의 학번을 입력하세요 ");
			studentID = sc.next();
			
			System.out.print("학생의 학년을 입력하세요 ");
			grade = sc.nextInt();
			
			System.out.print("학생의 학점을 입력하세요 ");
			gPA = sc.nextDouble();
			
			student[i] = new Main04(name, age, weight, height, studentID, grade, gPA);
		}
		
		for(int i = 0; i < number; i++) {
			student[i].show();
		}
	}
}
