/* [����] 1, 2, 3 ... �� ��� ���� ���� ��, �� ���� �Է��� ����(0 ~ 1000)���� ���ų� ���� ������ ��� ���ϴ� ���α׷��� �ۼ��غ���.
 * ��, 1���� n���� ������ ��� ���Ѵٰ� �� ��, ������ ���ؾ� �Է��� ������ ���ų� Ŀ������ �˾ƺ����� �ϴ� ����
 * �Է� : 55	-> ��� : 10		*/
import java.util.Scanner;

public class C1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int i;
		
		for(i = 0; i < a; i++) {
			sum = sum + i;
			if(a <= sum) {
				break;
			}	
		}
		System.out.println(i);
	}

}
