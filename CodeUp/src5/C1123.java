/* 섭씨 온도가 입력되면 화씨 온도로 변환하시오. 화씨 온도 = 9 / 5 * 섭씨온도 + 32
 * 입력 : 30	-> 출력 : 86.000	*/
import java.util.Scanner;

public class C1123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		sc.close();
		
		double result = 9*1.0/5*a+32;
		
		System.out.printf("%.3f", result);
	}

}
