/* ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ���� (ù° �ٿ� N(1 �� N �� 100)�� �־�����.)
 * �Է� : 5	-> ��� : * \ ** \ *** \ **** \ *****		*/
import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= N; i++) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	}

}
