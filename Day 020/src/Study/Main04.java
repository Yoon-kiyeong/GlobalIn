package Study;

public class Main04 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; //'A'�� �����ڵ�� 65
		
		System.out.println(y >= 5 || x < 0 && x > 2); //true
		System.out.println(x += 10 - x++); //10
		System.out.println(x +=2); //12
		System.out.println(!('A' <= c && c <= 'Z')); //false
		System.out.println('C' - c); //2
		System.out.println('5' - '0'); //5
		System.out.println(c + 1); //66
		System.out.println(++c); //B
		System.out.println(c++); //B
		System.out.println(c); //C
	}
}
