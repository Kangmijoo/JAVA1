import java.util.Scanner;

public class C1012 {

	public static void main(String[] args) {
		//1.
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		String str = String.format("%.6f", f);	//�Ҽ� 6��° �ڸ����� �ݿø��ؼ� ���
		
		System.out.println(str);
		
		sc.close();
		
		/* ex2.
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		
		System.out.printf("%f", f);

		sc.close();
		*/
	}

}
