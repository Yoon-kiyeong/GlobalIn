package Study;

public class Main01 {
	private int x;
	private int y;
	// private : �ܺο��� �Ժη� ������ �� ����

	public int getX() {
		return x;
	}

	public void setX(int x) { // x�� ���� �����ϱ� ���ؼ�
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Main01(int x, int y) { // ������
		this.x = x;
		this.y = y;
		// x�� y�� ���� �ʱ�ȭ ����
	}

	public Main01 getCenter(Main01 other) {
		return new Main01((this.x + other.getX()) / 2 , (this.y + other.getY()) / 2) ;
	}
}
