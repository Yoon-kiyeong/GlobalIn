
public class Ex02 {
	public static void main(String[] args) {
		int numOfAppels = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfAppels / sizeOfBucket + (numOfAppels % sizeOfBucket > 0 ? 1 : 0);
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
	}
}