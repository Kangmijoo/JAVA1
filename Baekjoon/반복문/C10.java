/* ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����. ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
 * �Է� : 5	-> ��� :     *
					   **
					  ***
					 ****
					*****		*/
import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= N; i++) {
			for(int j = N; j > i; j--) {	//���� ����
				System.out.print(" ");
			}
			
			int k = 1;
			while(k <= i) {					//�� ����
				System.out.print("*");
				k++;
			}
			System.out.println("");
		}
		
	}

}
