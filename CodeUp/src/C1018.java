import java.util.Scanner;

public class C1018 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		
//		System.out.println(str);
//		
//		sc.close();
		
/*		ex2. String[] split ���		*/
		Scanner sc = new Scanner(System.in);
		String clock = sc.nextLine();			//�� �� �Է� ����
		String[] arr = clock.split(":");		//':'�� �������� ���ڿ��� ����
		
		System.out.printf("%s:%s", arr[0], arr[1]);		//���� ���ڿ� ���
		
		sc.close();
	}

}
