package Study;

public class Study_002 {
	final static int SECOND = 1000;

	public static void main(String[] args) {

		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분 " + second + "초");
		
		int a = 10;
		System.out.println("현재의 a는 " + a + "입니다");
		a++;
		System.out.println("현재의 a는 " + a + "입니다");
		System.out.println("현재의 a는 " + ++a + "입니다");
		System.out.println("현재의 a는 " + a++ + "입니다");
		System.out.println("현재의 a는 " + a + "입니다");
		
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int q = 50;
		int w = 50;
		System.out.println("q와 w는 같은가요? " + (q == w));
		System.out.println("q가 w보다 큰가요? " + (q > w));
		System.out.println("q가 w보다 작은가요 ?" + (q < w));
		System.out.println("q가 w와 같으면서 q가 30보다 큰가요? " + ((q == w) && (q > w)));
		System.out.println("q가 50이 아닌가요? " + !(q == 50));
	
		int x = 50;
		int y = 60;
		System.out.println("최댓값은 " + max(x,y) + "입니다.");
		
		double z = Math.pow(3.0,  20.0);
		System.out.println("3의 20제곱근은 " + (int)z + "입니다");
	}
	
	//반환형, 함수 이름, 매개 변수
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}
}
