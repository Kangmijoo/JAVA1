/* 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * (1 ≤ N, X ≤ 10,000)둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 * 입력 : 10 5 \ 1 10 4 9 2 3 8 5 7 6	 -> 출력 : 1 4 2 3	*/
import java.util.Scanner;

public class C11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(A[i] < X) {
				System.out.print(A[i] +" ");
			}
		}
		sc.close();
		
	}

}
