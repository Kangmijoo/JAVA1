/* [����] 1���� n���� ������ ��� ���Ѵٰ� �� ��, ������ ���ؾ� �Է��� ������ ���ų� Ŀ������ �˾ƺ���. 
 * 1, 2, 3, 4, 5 ... ������� ��� ���ذ��ٰ�, �� ���� �Էµ� �������� Ŀ���ų� �������� ���, �׶������� ���� ����Ѵ�.
 * �Է� : 57	-> ��� : 66		*/
import java.util.Scanner;

public class C1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i = 1; i <= 100000000; i++) {
			sum += i;
			if(sum >= num) {
				System.out.println(sum);
				break;
			}
		}
		
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		
//		int sum = 0;
//		int i = 0;
//		while(sum < num) {
//			i++;
//			sum += i;
//		}
//		System.out.println(sum);
//		
//	}

}
