package Study;

public class Main03 {
	public static void main(String[] args) {
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("�Ҵ� : " + max);
		System.out.println("�ּڰ� : " + min);
	}
}
