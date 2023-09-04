package Study;

import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("rank : ");
		int rank = sc.nextInt();
		String medalColor;
		switch (rank) {
		case 1:
			medalColor = "G";
			System.out.println("medalColor : " + medalColor);
			break;
		case 2:
			medalColor = "S";
			System.out.println("medalColor : " + medalColor);
			break;
		case 3:
			medalColor = "B";
			System.out.println("medalColor : " + medalColor);
			break;
		default:
			medalColor = "A";
			System.out.println("medalColor : " + medalColor);
		}
	}
}