package Study;

public class Study_001 {
	public static void main(String[] args) {
		double a = 10.3;
		double b = 9.6; 
		double c = 10.1;
		
		System.out.println((a + b + c) /3);
		
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.println(i + " ");
		}
		
		
		int d = 200;
		System.out.println("10���� : " + d);
		System.out.format("8���� : %o\n ", d);
		System.out.format("16���� : %x ", d);
		
		String name = "John Doe";
		System.out.println(name);
		System.out.println(name.substring(0,1));
		System.out.println(name.substring(3,6));
		System.out.println(name.substring(5,8));
		
	}
}
