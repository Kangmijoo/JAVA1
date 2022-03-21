/* [종합] 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때, n번째 수를 출력하는 프로그램을 만들어보자. 
 * (a, m, d는 -50 ~ +50, n은 10이하의 자연수)
 * 입력 : 1 -2 1 8	-> 출력 : -85		*/
import java.util.Scanner;

public class C1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		long result = 0;
		result = a;			//n이 1일 경우 시작 값 바로 출력할 수 있도록
		
		for(int i = 1; i < n; i++) {
			if(i == 1) {		//처음에만 '시작값'에 곱하고 더하기
				result = a*m+d;
			} else {			//두번째 부터는 그 전 값에 곱하고 더하기
				result = result*m+d;
			}
		}
		System.out.print(result);
	}

}
