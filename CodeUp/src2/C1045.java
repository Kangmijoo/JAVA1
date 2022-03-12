/* 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자. (단 0 <= a, b <= 2147483647, b는 0이 아니다.)
 * 입력 : 10 3 ->	출력 : 13
					 7
					 30
					 3
					 1
					 3.33*/
import java.util.Scanner;
public class C1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double num = sc.nextDouble();
		Double num2 = sc.nextDouble();
		
		System.out.printf("%.0f\n", num + num2);
		System.out.printf("%.0f\n", num - num2);
		System.out.printf("%.0f\n", num * num2);
		System.out.printf("%.0f\n", num / num2);
		System.out.printf("%.0f\n", num % num2);
		System.out.printf("%.2f", num / num2);
	}

}
