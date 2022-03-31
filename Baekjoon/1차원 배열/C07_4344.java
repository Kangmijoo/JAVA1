/* ù° �ٿ� �׽�Ʈ ���̽��� ���� C�� �־���. ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, N���� ������ �־���.
 * (0<=����<=100�� ����) �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ���
 * �Է� : 5								-> ��� : 40.000%
		5 50 50 70 80 100						57.143%
		7 100 95 90 80 70 60 50					33.333%
		3 70 90 80								66.667%
		3 70 90 81								55.556%
		9 100 99 98 97 96 95 94 93 91							*/
import java.util.Scanner;

public class C07_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		/* ���̽���ŭ �Է¹��� -> N[i] */
		int[] N = new int[C];
		for(int i = 0; i < C; i++) {
			N[i] = sc.nextInt();
			
			/* �Է¹��� �����ŭ ���� �Է� �޾Ƽ�-> score[j] ���� ���� -> total */
			int num = N[i];		//�Է� ���� ���� ����
			int[] score = new int[num];		//���� ������ŭ score�迭 ����� ��
			int total = 0;		//��� ���� �� ���� ����
			int j = 0;
			while(j < num) {
				score[j] = sc.nextInt();
				total += score[j];
				j++;
			}
			/* �Է� ���� ������� ��� ��� -> avg */
			double avg = total*1.0/num; 
			
			/* ����� �Ѵ� ��� -> sum */
			int k = 0;
			int sum = 0;	//��� ���� ��� �� �߰����� ����
			while(k < num) {
				if(score[k]-avg > 0) {
					sum += 1;
				}
				k++;
			}
			/* ����� �Ѵ� ��� ���� */
			double result = sum*1.0/N[i]*100;
			
			/* ��� */
			System.out.printf("%.3f%%\n", result);
		}
		
	}

}
