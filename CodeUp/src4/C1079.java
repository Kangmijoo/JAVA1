/* [����] 'q'�� �Էµ� ������ �Է��� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ��غ���. 
 * �Է� : x b k d l q g a c	-> ��� : x
									b
									k
									d
									l
									q	*/
import java.util.Scanner;
	
public class C1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a;
		while (true) {
			a = sc.next().charAt(0);
			System.out.println(a);
			if(a == 'q') {
				break;
			}
		}
		sc.close();
	}

}
