package Study;

public class Study_002 {
	final static int SECOND = 1000;

	public static void main(String[] args) {

		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "�� " + second + "��");
		
		int a = 10;
		System.out.println("������ a�� " + a + "�Դϴ�");
		a++;
		System.out.println("������ a�� " + a + "�Դϴ�");
		System.out.println("������ a�� " + ++a + "�Դϴ�");
		System.out.println("������ a�� " + a++ + "�Դϴ�");
		System.out.println("������ a�� " + a + "�Դϴ�");
		
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int q = 50;
		int w = 50;
		System.out.println("q�� w�� ��������? " + (q == w));
		System.out.println("q�� w���� ū����? " + (q > w));
		System.out.println("q�� w���� �������� ?" + (q < w));
		System.out.println("q�� w�� �����鼭 q�� 30���� ū����? " + ((q == w) && (q > w)));
		System.out.println("q�� 50�� �ƴѰ���? " + !(q == 50));
	
		int x = 50;
		int y = 60;
		System.out.println("�ִ��� " + max(x,y) + "�Դϴ�.");
		
		double z = Math.pow(3.0,  20.0);
		System.out.println("3�� 20�������� " + (int)z + "�Դϴ�");
	}
	
	//��ȯ��, �Լ� �̸�, �Ű� ����
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}
}
