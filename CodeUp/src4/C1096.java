/* [2�����迭] �ٵ���(19 * 19)�� n���� �� ���� ���´ٰ� �� ��, n���� �� ���� ���� ��ġ�� ����ϴ� ���α׷��� �ۼ��غ���.
 * �ٵ��ǿ� �÷� ���� �� ���� ����(n)�� ù �ٿ� �Էµȴ�. ��° �� ���� n+1 ��° �ٱ��� �� ���� ���� ��ǥ(x, y)�� n�� �Էµȴ�.
 * n�� 10������ �ڿ����̰� x, y ��ǥ�� 1 ~ 19 �����̸�, ���� ��ǥ�� �Էµ��� �ʴ´�. �� ���� �ִ� ��ġ�� 1, ���� ���� 0���� ����Ѵ�.
 * �Է� : 5 \ 1 1 \ 2 2 \ 3 3 \ 4 4 \ 5 5		*/
import java.io.*;
import java.util.Scanner;

public class C1096 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		//�� �� ���� �Է¹���
		int n = sc.nextInt();
		//�ٵ��� �ʱ�ȭ
		int[][] arr = new int[19][19];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = 0;
			}
		}
		
		//�ٵϾ� �÷��� ��ǥ �Է� �ޱ�
		for(int i = 0; i < n; i++) {
			arr[sc.nextInt()-1][sc.nextInt()-1] = 1;
		}
		sc.close();
		
		//���
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	}

}
