/* 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
 * 첫째 줄에는 현재 시각. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 
 * 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 
 * 입력 : 14 30 \ 20	-> 출력 : 14 50	/ 입력 : 17 40 \ 80	-> 출력 : 19 0	*/
import java.util.Scanner;

public class C6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		//결과 값을 분으로 나타냄
		int result = (A*60+B)+C;
		
		//분으로 나타낸 결과 값을 시간:분으로 쪼갬
		int H, M;
		H = result/60;
		M = result%60;
		if(H >= 24) {	//H가 24가 넘어가는 경우 시간 다시 정리
			H = H - 24;
		}
		
		System.out.printf("%d %d", H, M);
	}

}
