package com.test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cnt = 0;
		String YorN = null;
		
		while(true) {
			int high = 99;
			int low = 0;
			
			System.out.println("수를 결정하였습니다. 맞추어보세요.");
			
			int random = (int)(Math.random()*99);
			
			while(true) {
				cnt ++; 
				System.out.println(cnt + " >>");
				num = sc.nextInt();
				
				if(num < random) {
					System.out.println("더 높게");
					low = num;
				System.out.println(low + " - " + high);
				}
				else if (num > random) {
					System.out.println("더 낮게");
					high = num;
					System.out.println(low + " - " + high);
				}
				else
					break;
			}
			
			if(num == random) {
				System.out.println("맞았습니다");
				System.out.println("다시 하시겠습니까?(y/n) >>");
				YorN = sc.next();
				char tmp = YorN.charAt(0);
				
				if(tmp == 'Y' || tmp == 'y') {
					cnt = 0;
					sc.nextLine();
					continue;
				} else if(tmp == 'n' || tmp == 'N')
					System.exit(0);
			} else {
				cnt = 0;
				sc.nextLine();
				System.out.println("y와 n만 입력 가능합니다");
			}
		}
	}
}
