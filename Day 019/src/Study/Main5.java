package Study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);	// 콘솔에 입력하는 데이터
//		System.out.println("정수를 입력하세요");
//		int i = sc.nextInt();
//		System.out.println("입력된 정수는 " + i + "입니다");
//		sc.close();

		File file = new File("input.txt");
		try {
			Scanner sc = new Scanner(file); //파일이 존재하지 않거나 읽어올 수 없을 때 에러 발생함
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 도중에 에러가 발생했습니다");
			e.printStackTrace();
		} 
	}
}
