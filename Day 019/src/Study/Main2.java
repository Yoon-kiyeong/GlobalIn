package Study;

public class Main2 {
	
	final static int N = 30;

	public static void main(String[] args) {
		// for�� : �ʱ�ȭ �κ�, ���� �κ�, ���� �κ�
		for(int i = N; i > 0; i --) {
			for(int j = i; j > 0; j--) {				
				System.out.print("��");
			}
			System.out.println();
		}
	}
}
