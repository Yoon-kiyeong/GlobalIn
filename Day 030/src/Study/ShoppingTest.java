package Study;

public class ShoppingTest {
	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		
		shopping.number = "201803120001";
		shopping.ID = "abc123";
		shopping.date = "2018�� 3�� 12��";
		shopping.name = "ȫ���";
		shopping.ProductNumber = "PD0345-12";
		shopping.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + shopping.number);
		System.out.println("�ֹ��� ���̵� : " + shopping.ID);
		System.out.println("�ֹ� ��¥ : " + shopping.date);
		System.out.println("�ֹ��� �̸� : " + shopping.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + shopping.ProductNumber);
		System.out.println("��� �ּ� : " + shopping.address);
	}
}
