/* �� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�. ��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.
 * �Է� : 5 3	 -> ��� : *****
					 *****
					 *****	*/
import java.util.Scanner;

public class ���簢��_����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        for(int i = 1; i <= b; i++) {
            for(int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
