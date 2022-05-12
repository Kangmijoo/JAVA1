/* 2���� ��� ���� �� N���� �־�����. ��ǥ�� y��ǥ�� �����ϴ� ������, y��ǥ�� ������ x��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : 5 \ 0 4 \ 1 2 \ 1 -1 \ 2 2 \ 3 3	-> ��� : 1 -1 \ 1 2 \ 2 2 \ 3 3 \ 0 4	*/
import java.util.Arrays;
import java.util.Scanner;

public class C07_11651 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		//�迭�� �Է� �ޱ�
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		
		//����
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			} else {
				return o1[1] - o2[1];
			}
		});
		
		//���
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] +" "+ arr[i][1]);
		}

	}

}
