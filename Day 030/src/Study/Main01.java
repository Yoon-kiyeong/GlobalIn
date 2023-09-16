package Study;

public class Main01 {
	private int x;
	private int y;
	// private : 외부에서 함부로 접근할 수 없음

	public int getX() {
		return x;
	}

	public void setX(int x) { // x의 값을 설정하기 위해서
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Main01(int x, int y) { // 생성자
		this.x = x;
		this.y = y;
		// x와 y의 값을 초기화 해줌
	}

	public Main01 getCenter(Main01 other) {
		return new Main01((this.x + other.getX()) / 2 , (this.y + other.getY()) / 2) ;
	}
}
