package com.my;

/*
 * ����) �л����� ����, ����, ���� ������ �Է� �޾� ����, ���, ������ ����
 * 
 * Ŭ������ ����
 * 1. Record Ŭ���� - �Ӽ��� �����ϴ� Ŭ����
 * 2. Sungjuk Ŭ���� - �ο����� �Է¹޾�, �Է¹��� �ο��� ��ŭ �̸�, ����, ����, ���� ������ �Է¹ް� ����, ���, ������ ����
 * �Ӽ�(�������) : �ο���, Record ��ü�迭
 * ���(�޼ҵ�) : �ο��� �Է�, �� ������ �Է�, ����/���/���� ���, ��� ��� ���
 * 3. ������ SungjukMain Ŭ�������� ����
 */
import java.util.Scanner;

class Record {
	String name;
	int kor;
	int eng;
	int math;
	int sum = 0;
	double avg = 0;
	int rank = 1;
}

class Sungjuk {
	int people; // �ο���
	Record re[]; // Record �迭

	Scanner sc = new Scanner(System.in);

	// �ο��� �Է�(�޼ҵ�)
	void set() {

		do {
			System.out.print("�ο� �� �Է�(1 ~ 100) : ");
			people = sc.nextInt();
		} while (people < 1 || people > 100);

		// ��ü ��� ���� �Ҵ�
		re = new Record[people]; // ��ü�迭 ���� �� ���� ����
	}

	// �� ���� �Է�(�̸�, ����, ����, ���� ���� �Է¹ް� ���� ����)
	void input() {

		for (int i = 0; i < re.length; i++) {
			re[i] = new Record(); // �ο��� ��ŭ ��ü ����
			System.out.printf("%d��° �л��� �̸� �Է� : ", i + 1); // �̸� �Է�
			re[i].name = sc.next();
			System.out.print("�������� : ");
			re[i].kor = sc.nextInt();

			System.out.print("�������� : ");
			re[i].eng = sc.nextInt();

			System.out.print("�������� : ");
			re[i].math = sc.nextInt();
		} // �̸�, ����, ����, ���� ���� �Է� �ޱ�
		
		// ����, ���
		for (int i = 0; i < re.length; i++) {
			re[i].sum = re[i].kor + re[i].eng + re[i].math;
			re[i].avg = re[i].sum / 3.0;
		}
		
		//����
		for(int i = 0; i < re.length; i++ ) {
			for(int j = 0; j < re.length; j++) {
				if(re[i].sum < re[j].sum) {					
					re[i].rank++;
				}
			}
		}
	}
	
	//���� ��� ���
	void print() {
		System.out.println();
		System.out.printf("�̸� : \t ���� : \t ���� : \t ���� : \t ���� : \t ��� : \t ���� :\n");
		for(int i = 0 ; i < re.length; i++) {
			System.out.printf("%s %8d%8d%8d%8d " + "\t" + "%.2f %4d",re[i].name, re[i].kor, re[i].eng, re[i].math, re[i].sum, re[i].avg, re[i].rank);
		}
	}
}

public class Main02 {
	public static void main(String[] args) {
		Main02 ma = new Main02();
		Sungjuk sj = new Sungjuk();
		sj.set();
		sj.input();
		sj.print();
	}
}
