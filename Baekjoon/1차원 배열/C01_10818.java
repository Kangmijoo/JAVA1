/* N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. N (1 �� N �� 1,000,000)
 * ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� ����
 * �Է� : 5 \ 20 10 35 30 7	-> ��� : 7 35	*/
import java.util.Arrays;
import java.util.Scanner;

public class C01_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//N���� ������ x�迭�� �Է¹���
		int[] x = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		
		//�迭 ��������
		Arrays.sort(x);;
		int min = x[0];
		int max = x[x.length-1];
		
		//���
		System.out.println(min +" "+ max);
	}

}
