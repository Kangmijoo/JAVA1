/* [����] ����(1 ~ 100) 1���� �Է¹޾� 1���� �� ������ ¦���� ���� ���غ���. 
 * �Է� : 5	-> ��� : 6	*/
import java.util.Scanner;

public class C1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i = 0; i <= a; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			} else {
				sum = sum;
			}
		}
		System.out.println(sum);
	}

}
