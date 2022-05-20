import java.util.Arrays;
import java.util.Scanner;

/* 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값(소수점 이하 첫째 자리에서 반올림) / 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값 / 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 * N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
 * 입력 : 5 \ 1 \ 3 \ 8 \ -2 \ 2	-> 출력 : 2 \ 2 \ 1 \ 10	/ 입력 : 1 \ 4000	 -> 출력 : 4000 \ 4000 \ 4000 \ 0*/
public class C04_2108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		//1. 평균(첫째 자리에서 반올림)
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += num[i];
		}
		System.out.printf("%.0f\n", sum/N*1.0);
		//2. 중앙 값
		Arrays.sort(num);
		System.out.printf("%d\n", num[N/2]);
		//3. 최빈값
		int result = 0;
		int[] index = new int[N];
		for(int i = 0; i < N; i++) {
			index[num[i]]++;
		}
		int max = 0;
		for(int i = 0; i < N; i++) {
			if(index[i] > max) {
				max = index[i];
				result = i;
			}
		}
		System.out.println(result);
		//4. 최댓값 - 최솟값
		System.out.println(num[num.length-1]-num[0]);
	}

}
