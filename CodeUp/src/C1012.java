import java.util.Scanner;

public class C1012 {

	public static void main(String[] args) {
		//1.
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		String str = String.format("%.6f", f);	//소수 6번째 자리까지 반올림해서 출력
		
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
