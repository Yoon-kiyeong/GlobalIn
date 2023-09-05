package com.my;

import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) {
		int A, B, C;
		int Max,Mid,Min;
		Scanner s = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		
//		if(A>B) {
//			Max = A;
//			Min = B;
//			if(Max>C) {
//				if(C>Min) 
//					Mid = C;
//				else {
//					Mid = Min;
//					Min = C;
//				}
//			}
//			else {
//				Mid = Max;
//				Max = C;
//			}
//		}
//		else {
//			Max = B;
//			Min = A;
//			if(Max>C) {
//				if(C>Min) 
//					Mid = C;
//				else {
//					Mid = Min;
//					Min = C;
//				}
//			}
//			else {
//				Mid = Max;
//				Max = C;
//			}
//		}
//		System.out.println("중간 값은 " + Mid);
		Mid = A;
		if ((A >= B && A <= C) || (A >= C && A <= B)) {
			Mid = A;
		} else if ((B >= A && B <= C) || (B >= C && B <= C)) {
			Mid = B;
		} else {
			Mid = C;
		}
		System.out.println("중간값 : " + Mid);
	}
}
