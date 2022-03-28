/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 입력 : 5 / 1 1 / 2 3 / 3 4 / 9 8 / 5 2	  -> 출력 : 2 / 5 / 7 / 17 / 7		*/
import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 개수 받아옴
		int T = sc.nextInt();
		//케이스 개수 만큼 두 정수 쌍을 받아옴
		int[] A = new int[T];
		int[] B = new int[T];
		for(int i = 0; i < T; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		sc.close();
		
		//결과 값 출력
		int result;
		for(int i = 0; i < T; i++) {
			result = A[i]+B[i];
			System.out.println(result);
		}
		
	}

}
