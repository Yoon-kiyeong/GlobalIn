package com.exception.one;

/*	throws(�޼ҵ��� ���� ����)
 * - �޼ҵ��� ����ο� ����� throws�� ����ؼ� �޼ҵ� ������ �߻��� �� �ִ� ���ܸ� �����ֱ⸸ �ϸ� �ȴ�.
 * 
 * ����
 *  [����������] [��ȯ��] �޼ҵ��(�ڷ��� �Ű�����1, ...) throws IOException, ArithmeticException, FileNotFoundException ... 
 * 
 * 
 */
public class ExceptionEx06 {

	private static void test() throws Exception {
		System.out.println(6 / 0);
	}

	public static void main(String[] args) throws Exception { // throws Exception�� �޼ҵ� �ڿ� ���� (1)
		// �޼ҵ� ȣ�� �� ȣ���� �޼ҵ尡 ���ܰ� ����Ǿ� ���� ��, ȣ���ϴ� �������� ����ó���� �ؾ� ��
		// �޼ҵ� ȣ�� �� try/catch ������� ó�� (2)
		try {
			test();			
		} catch (Exception e) {
			
		}
	}
}
