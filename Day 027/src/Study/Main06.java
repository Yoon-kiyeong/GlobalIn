package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] input = new char[5][15]; // (���� 5 ���� 15)

		for (int i = 0; i < input.length; i++) {
			// ���ڿ� (5��) �Է� �ޱ�
			String str = br.readLine();
			// ���� �ϳ��� �˻��ϱ����� ���ڿ��� ���ڹ迭�� �ϳ��� �־��ֱ�
			for (int j = 0; j < str.length(); j++) {
				input[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (input[j][i] == '\0')
					continue;
				System.out.print(input[j][i]);
			}
		}

	}
}
