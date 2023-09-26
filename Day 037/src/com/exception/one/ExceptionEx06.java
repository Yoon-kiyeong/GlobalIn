package com.exception.one;

/*	throws(메소드의 예외 선언)
 * - 메소드의 선언부에 예약어 throws를 사용해서 메소드 내에서 발생할 수 있는 예외를 적어주기만 하면 된다.
 * 
 * 형식
 *  [접근제한자] [반환형] 메소드명(자료형 매개변수1, ...) throws IOException, ArithmeticException, FileNotFoundException ... 
 * 
 * 
 */
public class ExceptionEx06 {

	private static void test() throws Exception {
		System.out.println(6 / 0);
	}

	public static void main(String[] args) throws Exception { // throws Exception를 메소드 뒤에 선언 (1)
		// 메소드 호출 시 호출한 메소드가 예외가 선언되어 있을 시, 호출하는 곳에서도 예외처리를 해야 함
		// 메소드 호출 시 try/catch 블록으로 처리 (2)
		try {
			test();			
		} catch (Exception e) {
			
		}
	}
}
