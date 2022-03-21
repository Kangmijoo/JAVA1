/* [1�����迭] ù ��° �ٿ� �⼮ ��ȣ�� �θ� Ƚ���� ���� n�� �Էµȴ�. 
 * (1 ~ 10000) �� ��° �ٿ��� �������� �θ� n���� ��ȣ(1 ~ 23)�� ������ �ΰ� ������� �Էµȴ�.
 * 1������ ��ȣ�� �Ҹ� Ƚ���� ������� �������� �����Ͽ� �� �ٷ� ����Ѵ�.
 * �Է� : 10 \ 1 3 2 2 5 6 7 4 5 9	-> ��� : 1 2 1 1 2 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0	*/
import java.util.*;

public class C1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//arr�迭�� �������� �θ� ��ȣ �ֱ�
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		//count�迭 �ʱ�ȭ	
		int[] count = new int[23];
		for(int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		
		//count�迭�� �Ҹ� Ƚ����ŭ �� �߰�
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j <= count.length; j++) {
				if(arr[i] == j) {
					count[j-1]++;	//�迭 ù ���� 0�̴� j-1
				}
			}
		}
		
		//�迭 ���
		for(int i : count) {
			System.out.print(i +" ");
		}
		
	}

}
