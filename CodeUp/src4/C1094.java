/* [1�����迭] ��ȣ�� �θ� Ƚ��(n, 1 ~ 10000)�� ù �ٿ� �Էµȴ�. n���� ���� ��ȣ(k, 1 ~ 23)�� �� ��° �ٿ� ������ ���̿� �ΰ� ������� �Էµȴ�.
 * �Է� : 10 \ 10 4 2 3 6 6 7 9 8 5	-> ��� : 5 8 9 7 6 6 3 2 4 10	*/
import java.util.Scanner;

public class C1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());	//��ȣ �θ� Ƚ��(n)�� �޾ƿ�
		
		//�Էµ� ũ�⿡ �°� �迭 ����(���� �� ����)
		int[] arr = new int[n];		
		//����� �� arr�迭�� �� �Է�
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();		
		}
		sc.close();
		
		//�ݴ�� �Է¹��� �迭 ����(���� ��)
		int[] reverseArr = new int[n];	
		//arr�迭�� reverse�迭�� ���� �ڹٲ�
		for(int i=n-1, j=0; i>=0; i--, j++) {
			reverseArr[j] = arr[i];		
		}
		
		//reverse�� ����ִ� �迭 ���
		for(int i : reverseArr) {		
			System.out.printf(i +" ");
		}
		
	}

}
