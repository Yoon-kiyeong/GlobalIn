package Study;
public class Main1 {
	public static void main(String[] args) {
		String a = "I Love You";
		if(a.contains("Love")) {
			//�����ϴ� ��� ����Ǵ� �κ�
			System.out.println("Me Too");
		} else {
			//�������� �ʴ� ��� ����Ǵ� �κ�
			System.out.println("I Hate You");
		}
		
		int score = 95;
		
		if(score >= 90) {
			System.out.println("A+�Դϴ�");
		} else if (score >= 80) {
			System.out.println("B+�Դϴ�");
		} else if (score >= 70) {
			System.out.println("C+�Դϴ�");
		} else {
			System.out.println("F�Դϴ�");
		}
		
		String q = "Man";
		int w = 0;
		// �ڹٴ� String�� ���� �� euqa()�� �̿��Ѵ�.
		// �� ������ String�� �ٸ� �ڷ����� �ٸ� ���ڿ� �ڷ����̱� ����
		if(q.equals("Man")) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("���ڰ� �ƴմϴ�");
		} if(w == 3) {
			System.out.println("w�� 3�Դϴ�");
		} else {
			System.out.println("3�� �ƴմϴ�");
		} if(q.equalsIgnoreCase("man") && w == 0) {
			System.out.println("���Դϴ�");
		} else {
			System.out.println("�����Դϴ�");
		}
	}
}
