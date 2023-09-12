package Study;

public class Main05 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];

		int print = 5;
		int k = 1;
		int right = -1;
		int bottom = 0;
		int top = 1;

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < print; j++) {
				right += top;
				arr[bottom][right] = k;
				System.out.println(bottom + " \t " + right + " \t " + arr[bottom][right]);
				k++;
			}

			print--;

			for (int j = 0; j < print; j++) {
				bottom += top;
				arr[bottom][right] = k;
				System.out.println(bottom + " \t " + right + " \t " + arr[bottom][right]);
				k++;
			}
			top = top * (-1);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
