package Study;

public class ShoppingTest {
	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		
		shopping.number = "201803120001";
		shopping.ID = "abc123";
		shopping.date = "2018년 3월 12일";
		shopping.name = "홍길순";
		shopping.ProductNumber = "PD0345-12";
		shopping.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + shopping.number);
		System.out.println("주문자 아이디 : " + shopping.ID);
		System.out.println("주문 날짜 : " + shopping.date);
		System.out.println("주문자 이름 : " + shopping.name);
		System.out.println("주문 상품 번호 : " + shopping.ProductNumber);
		System.out.println("배송 주소 : " + shopping.address);
	}
}
