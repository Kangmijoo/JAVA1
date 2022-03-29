/* N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오. N (1 ≤ N ≤ 1,000,000)
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수
 * 입력 : 5 \ 20 10 35 30 7	-> 출력 : 7 35	*/
import java.util.Arrays;
import java.util.Scanner;

public class C01_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//N개의 정수들 x배열에 입력받음
		int[] x = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		
		//배열 오름차순
		Arrays.sort(x);;
		int min = x[0];
		int max = x[x.length-1];
		
		//출력
		System.out.println(min +" "+ max);
	}

}
