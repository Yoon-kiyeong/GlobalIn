package Study;

public class Main02 {
	public static void main(String[] args) {
		Main01 one = new Main01(10, 20);
		Main01 two = new Main01(30, 40);
		Main01 result = one.getCenter(two);
		System.out.println("x : " + result.getX() + ", y : " + result.getY());
	}
}
