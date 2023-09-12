package Study;

public class Main04 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j % 2 == 0) {
					arr[i][j] = (i + 1) + 5 * j;
				} else {
					arr[i][j] = 5 * (j + 1) - i;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
}
