package Study;
public class Main1 {
	public static void main(String[] args) {
		String a = "I Love You";
		if(a.contains("Love")) {
			//포함하는 경우 실행되는 부분
			System.out.println("Me Too");
		} else {
			//포함하지 않는 경우 실행되는 부분
			System.out.println("I Hate You");
		}
		
		int score = 95;
		
		if(score >= 90) {
			System.out.println("A+입니다");
		} else if (score >= 80) {
			System.out.println("B+입니다");
		} else if (score >= 70) {
			System.out.println("C+입니다");
		} else {
			System.out.println("F입니다");
		}
		
		String q = "Man";
		int w = 0;
		// 자바는 String을 비교할 때 euqa()를 이용한다.
		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문
		if(q.equals("Man")) {
			System.out.println("남자입니다");
		} else {
			System.out.println("남자가 아닙니다");
		} if(w == 3) {
			System.out.println("w는 3입니다");
		} else {
			System.out.println("3이 아닙니다");
		} if(q.equalsIgnoreCase("man") && w == 0) {
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
	}
}
