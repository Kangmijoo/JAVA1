/* 3���� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ (����)/M*100���� ���ƴ�.
 * �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� ���� �� ������ ���� N(N < 1000). ��° �ٿ� �������� ���� ����(0 <= 100)
 * �Է� : 3 \ 40 80 60	-> ��� : 75.0	*/
import java.util.Arrays;
import java.util.Scanner;

public class C05_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		for(int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}
		
		//���� �� �ִ밪 ���ϱ�
		Arrays.sort(score);
		int max = score[N-1];
		
		//��� ���ϱ�
		double[] avg = new double[N];
		double sum = 0;
		for(int i = 0; i < N; i++) {
			avg[i] = (score[i]*1.0/max)*100;	//���������� ������ score�迭�� 1.0�� �����༭ double������ ��ȯ
			sum += avg[i];
		}
		
		System.out.println(sum/N);
		
	}

}
