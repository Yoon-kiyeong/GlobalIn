package Study;

public class Main3 {
	
	final static int N = 15;
	
	public static void main(String[] args) {
		for(int i = -N; i <= N; i ++) {
			for(int j = -N; j <= N; j++) {
				if(i * i + j * j <= N * N) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
