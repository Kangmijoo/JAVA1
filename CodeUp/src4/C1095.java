/* [1�����迭] ��ȣ�� �θ� Ƚ��(n, 1 ~ 10000)�� ù �ٿ� �Էµȴ�. n���� ���� ��ȣ(k, 1 ~ 23)�� �� ��° �ٿ� ������ ���̿� �ΰ� ������� �Էµȴ�.
 * �⼮�� �θ� ��ȣ �߿� ���� ���� ��ȣ�� 1���� ����Ѵ�.
 * �Է� : 10 \ 10 4 2 3 6 6 7 9 8 5	-> ��� : 2	*/
import java.util.Arrays;
import java.util.Scanner;

public class C1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��ȣ �θ� Ƚ�� �Է�
		int n = sc.nextInt();
		//n���� ���� ��ȣ arr�迭�� �Է�
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);	//�迭�� ���ĵ� ������ ����
		System.out.println(arr[0]);		//ù��° �迭(���� ���� ��) ���
										//������ �迭(���� ū ��) -> arr[arr.length-1]  
	}

}
