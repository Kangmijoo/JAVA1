/* N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ�. ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. 
 * ��° �ٺ��� N���� �ٿ��� �� �־�����. �� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 * �Է� : 5 \ 5 \ 2 \ 3 \ 4 \ 1	-> ��� : 1 \ 2 \ 3 \ 4 \ 5 	*/
import java.util.Arrays;
import java.util.Scanner;

public class C01_2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < a; i++) {
			System.out.println(arr[i]);
		}
	}

}
