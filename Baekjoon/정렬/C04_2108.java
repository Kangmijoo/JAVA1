import java.util.Arrays;
import java.util.Scanner;

/* ���� ó���ϴ� ���� ����п��� ����� �߿��� ���̴�. ����п��� N���� ���� ��ǥ�ϴ� �⺻ ��谪���� ������ ���� �͵��� �ִ�. ��, N�� Ȧ����� ��������.
 * ������ : N���� ������ ���� N���� ���� ��(�Ҽ��� ���� ù° �ڸ����� �ݿø�) / �߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
 * �ֺ� : N���� ���� �� ���� ���� ��Ÿ���� �� / ���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
 * N���� ���� �־����� ��, �� ���� �⺻ ��谪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : 5 \ 1 \ 3 \ 8 \ -2 \ 2	-> ��� : 2 \ 2 \ 1 \ 10	/ �Է� : 1 \ 4000	 -> ��� : 4000 \ 4000 \ 4000 \ 0*/
public class C04_2108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		//1. ���(ù° �ڸ����� �ݿø�)
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += num[i];
		}
		System.out.printf("%.0f\n", sum/N*1.0);
		//2. �߾� ��
		Arrays.sort(num);
		System.out.printf("%d\n", num[N/2]);
		//3. �ֺ�
		int result = 0;
		int[] index = new int[N];
		for(int i = 0; i < N; i++) {
			index[num[i]]++;
		}
		int max = 0;
		for(int i = 0; i < N; i++) {
			if(index[i] > max) {
				max = index[i];
				result = i;
			}
		}
		System.out.println(result);
		//4. �ִ� - �ּڰ�
		System.out.println(num[num.length-1]-num[0]);
	}

}
