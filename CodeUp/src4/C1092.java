/* [����] ���� �� ���ÿ� ������ �ο� 3���� ��Ģ������ �湮�ϴ�, �湮 �ֱⰡ ������ �ΰ� �Էµȴ�. (��, �Է°��� 100������ �ڿ����̴�.)
 * 3���� �ٽ� ��� �Բ� �湮�� ������ Ǯ��� ��(���� ����/��� �� ��ĥ ��?)�� ����Ѵ�.
 * �Է� : 3 7 9	-> ��� : 63	*/
import java.util.Scanner;

public class C1092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		for(int day = 1; day <= num1*num2*num3; day++) {
			if(day % num1 == 0 && day % num2 == 0 && day % num3 == 0) {
				System.out.println(day);
				break;
			}
		}
		
	}

}
