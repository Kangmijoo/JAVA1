/* 0.3 × 86 + 0.3 × 90 + 0.4 × 85 = 86.8 이런 방법으로 전 과목의 점수를 계산. 
 * 반영비율과 점수를 알고 있을 때 각 과목의 점수를 계산하는 프로그램을 작성하시오.
 * 입력 : 0.3 50 \ 0.4 80 \ 0.3 92	-> 출력 : 74.6	*/
import java.util.Scanner;

public class C1127 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		for(int i = 0; i < 3; i++) {
			double ratio = sc.nextDouble();
			double score = sc.nextDouble();
			sum += ratio*score;
		}
		sc.close();
		System.out.printf("%.1f", sum);
	}

}
