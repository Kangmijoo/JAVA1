/* �����������̸� �����ϴ� �ð��� ���챸�̸� �ϴ� �� �ʿ��� �ð��� �д����� �־����� ��, ���챸�̰� ������ �ð��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ��� ���� �ð�. ���� �ð��� �� A (0 �� A �� 23) �� �� B (0 �� B �� 59)�� ������ ��ĭ�� ���̿� �ΰ� ������� �־�����. 
 * �� ��° �ٿ��� �丮�ϴ� �� �ʿ��� �ð� C (0 �� C �� 1,000)�� �� ������ �־�����. 
 * �Է� : 14 30 \ 20	-> ��� : 14 50	/ �Է� : 17 40 \ 80	-> ��� : 19 0	*/
import java.util.Scanner;

public class C6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		//��� ���� ������ ��Ÿ��
		int result = (A*60+B)+C;
		
		//������ ��Ÿ�� ��� ���� �ð�:������ �ɰ�
		int H, M;
		H = result/60;
		M = result%60;
		if(H >= 24) {	//H�� 24�� �Ѿ�� ��� �ð� �ٽ� ����
			H = H - 24;
		}
		
		System.out.printf("%d %d", H, M);
	}

}
