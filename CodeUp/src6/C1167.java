/* �� ���� ���ڰ� �־��� �� ���� ������ ���� ���� ��, �ι�° ���� ����غ���. 
 * ���� ���, 5 9 2 �� �ִٸ�, ���� ������ �����ϸ� 2 5 9�̰� �ι�° ���� 5�̴�.
 * �Է� : 201 20 3	-> ��� : 20	*/
import java.util.Arrays;
import java.util.Scanner;

public class C1167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		
		//�迭�� ������������ ����
		Arrays.sort(arr);
		//�迭�� �ι�° ���� ���
		int result = arr[1];
		
		System.out.println(result);
	}

}
