package com.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
				if(args.length == 0) {
				System.out.println("Usage : java Test subject1, subject2 .....");
				System.exit(0);// 프로그램 종료
				}
				// args.length == 과목수​

				System.out.print("이름 입력:");
				String name = br.readLine();
				String[] subject = new String[args.length];

				// 과목수 만큼 공간을 할당
				for(int i = 0; i<args.length; i++) {

				subject[i] = args[i];// 과목명을 옮긴다.
				}
				
				int jumsu[] = new int[subject.length+1];// 국어, 영어, 수학, 총점 : 4

				// 마지막 공간은 총점을 저장하는 공간

				                                                                   

				for(int i = 0; i < jumsu.length-1;i++) {

				System.out.print(subject[i]+"점수:");

				jumsu[i] = Integer.parseInt(br.readLine());
				// 각 과목별로 점수를 입력받아 저장한다.

				// 누적을 합계를 구한다.

				jumsu[jumsu.length-1] +=jumsu[i];// 총점
				}
				// 평균

				float avg =jumsu[jumsu.length-1] / (float)subject.length;

				// 소수점 3자리

				avg=(int)((avg+0.005)*100)/100.f;// 소수점 3자리에서 반올림처리하는 공식​

				char grade = 0;

				switch((int)(avg/10)) {// 학점 판정

				case 10:

				case 9: grade='A';break;

				case 8: grade='B';break;

				case 7: grade='C';break;

				case 6: grade='D';break;

				default:grade='F';break;

				}

				System.out.println();

				System.out.println("*************  성적표 **************");

				System.out.print("이름\t\t");

				for(int i = 0; i <subject.length; i++) {

				System.out.print(subject[i]+"\t");

				}

				System.out.println("총점\t 평균\t학점");

				System.out.print(name+"\t\t");

				for(int i = 0; i <subject.length+1;i++) {

				System.out.print(" "+jumsu[i]+"\t");

				}

				System.out.println(""+avg+"\t "+grade);

				System.out.println("********************************");
	}
}
