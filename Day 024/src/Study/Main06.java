package Study;

public class Main06 {

	// �Ǻ���ġ �ݺ��Լ�
//	public static int fibonacci(int number) {
//		int one = 1;
//		int two = 1;
//		int result = -1;
//		if(number == 1) {
//			return one;
//		} else {
//			for(int i = 2; i < number; i++) {
//				result = one + two;
//				one = two;
//				two = result;
//			}
//		}
//		return result;
//	}
//	
	// �Ǻ���ġ ��� �Լ�
	public static int fibonacci(int number) {
		if(number == 1) {
			return 1;
		} else if(number == 2) {
			return 1;
		} else {
			return fibonacci(number -1) + fibonacci(number - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println("�Ǻ���ġ ������ 10���� ���Ҵ� " + fibonacci(10) + "�Դϴ�");
	}
}
