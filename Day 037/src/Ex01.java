
public class Ex01 {
	public static void main(String[] args) {
		int arr[][] = new int[4][];
		int count = 1;
		int k = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[k];
			for(int j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = count;
				count++;
			}
			k++;
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}