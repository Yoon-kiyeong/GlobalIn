package com.my;

/*
 * For
 * 	- 특정한 명령들을 정해진 규칙에 따라 반복처리 할 때 사용하는 반복문임
 *  - 형식
 *  	for(초기값; 조긴식; 증감식) {
 *  		(1)		(2)	  (3)
 *  		반복 실행 문장(4)
 *  	}
 *  
 *  1. 가장 먼저 한번 만 수행함
 *  2. 초기값 다음으로 수행되고 반복이 될때마다 한번씩 비교하여 반복 수행할지 아니면 벗어날지를 결정함
 *  3. 2번이 참일경우 계속해서 수행되는 문장
 *  4. 반복이 될 때마다 조건식에 비교하기 전에 항상 수행한다.
 *     변수값을 증가 또는 감소시켜 반복을 원활하게 수행함
 */

public class Main06 {
	public static void main(String[] args) {
		int i, sum;
		for(i = 1 , sum = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1 ~ " + i + "까지의 합계 " + sum);
	}
}
