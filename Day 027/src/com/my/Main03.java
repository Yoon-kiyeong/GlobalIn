package com.my;
/* ������ �迭
 * 
 * ������ �迭 ����
 * 	1. �ڷ���[][] �迭��;
 *  2. �ڷ��� �迭��[][];
 *  3. �ڷ���[] �迭��[];
 *  
 *  �ʱ��
 *  	1. �迭�� = new �ڷ���[row][coluimn]; --> �����迭
 *  	2. �迭�� �ڷ���[row][] -> ������, �����迭, ����� �迭
 *  	3. �迭�� = {
 *  				{1,2}, --> ù��° ��
 *  				{3,4}, --> ù��° ��
 *  				-> ���� ������ ���� �޸��� ������(,) ...};
 * 
 */
public class Main03 {
	public static void main(String[] args) {
		//�迭 ����
		int[][] test;
		
		//�迭 �ʱ�ȭ
		test = new int[2][3];
		
		//ù��° �� ����
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		//ù���� �� ��
		
		//�ι�° �� ����
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		//�ι�° �� ��

		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(test[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
