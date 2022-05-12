import java.util.Arrays;
import java.util.Scanner;

public class C06_11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		//�迭 �Է� �ޱ�
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		
		//�迭 ����
		Arrays.sort(arr, (o1, o2) -> { 
			if(o1[0] == o2[0]) {	//0��°�� ���� ��� 1��° ��
				return o1[1] - o2[1];
			} else {
				return o1[0] - o2[0];
			}
		});

		//���
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] +" "+ arr[i][1]);
		}
		
	}

}
