/* 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 * 입력 : 3 \ 29 \ 38 \ 12 \ 57 \ 74 \ 40 \ 85 \ 61	-> 출력 : 85 \ 8		*/
import java.util.Arrays;
import java.util.Scanner;

public class C02_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[9];
		//x배열에 9개의 자연수 값 받기
		for(int i = 0; i < 9; i++) {
			x[i] = sc.nextInt();
		}

		//stream을 이용한 배열 중 가장 큰 수 구하기
		int max = Arrays.stream(x).max().getAsInt();
		
		//max가 배열에서 몇번째 값인지 구하기
		int num = 0;
		for(int i = 0; i < 9; i++) {
			if(x[i] == max) {
				num = i+1;
				break;
			}
		}
		
		// 출력
		System.out.printf("%d\n%d", max, num);
	}

}
