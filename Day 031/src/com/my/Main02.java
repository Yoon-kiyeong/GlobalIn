package com.my;

/*
 * 문제) 학생별로 국어, 영어, 수학 점수를 입력 받아 총점, 평균, 석차를 구현
 * 
 * 클래스의 구성
 * 1. Record 클래스 - 속성만 존재하는 클래스
 * 2. Sungjuk 클래스 - 인원수를 입력받아, 입력받은 인원수 만큼 이름, 국어, 영어, 수학 점수를 입력받고 총점, 평균, 석차를 구현
 * 속성(멤버변수) : 인원수, Record 객체배열
 * 기능(메소드) : 인원수 입력, 상세 데이터 입력, 총점/평균/석차 계산, 결과 출력 기능
 * 3. 실행은 SungjukMain 클래스에서 실행
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
	int people; // 인원수
	Record re[]; // Record 배열

	Scanner sc = new Scanner(System.in);

	// 인원수 입력(메소드)
	void set() {

		do {
			System.out.print("인원 수 입력(1 ~ 100) : ");
			people = sc.nextInt();
		} while (people < 1 || people > 100);

		// 객체 뱅려 공간 할당
		re = new Record[people]; // 객체배열 생성 후 공간 생성
	}

	// 상세 정보 입력(이름, 국어, 영어, 수학 점수 입력받고 성적 산출)
	void input() {

		for (int i = 0; i < re.length; i++) {
			re[i] = new Record(); // 인원수 만큼 객체 생성
			System.out.printf("%d번째 학생의 이름 입력 : ", i + 1); // 이름 입력
			re[i].name = sc.next();
			System.out.print("국어점수 : ");
			re[i].kor = sc.nextInt();

			System.out.print("영어점수 : ");
			re[i].eng = sc.nextInt();

			System.out.print("수학점수 : ");
			re[i].math = sc.nextInt();
		} // 이름, 국어, 영어, 수학 점수 입력 받기
		
		// 총점, 평균
		for (int i = 0; i < re.length; i++) {
			re[i].sum = re[i].kor + re[i].eng + re[i].math;
			re[i].avg = re[i].sum / 3.0;
		}
		
		//석차
		for(int i = 0; i < re.length; i++ ) {
			for(int j = 0; j < re.length; j++) {
				if(re[i].sum < re[j].sum) {					
					re[i].rank++;
				}
			}
		}
	}
	
	//성적 결과 출력
	void print() {
		System.out.println();
		System.out.printf("이름 : \t 국어 : \t 영어 : \t 수학 : \t 총점 : \t 평균 : \t 석차 :\n");
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
