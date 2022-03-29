/* 3개의 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 (점수)/M*100으로 고쳤다.
 * 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 시험 본 과목의 개수 N(N < 1000). 둘째 줄에 세준이의 현재 성적(0 <= 100)
 * 입력 : 3 \ 40 80 60	-> 출력 : 75.0	*/
import java.util.Arrays;
import java.util.Scanner;

public class C05_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		for(int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}
		
		//점수 중 최대값 구하기
		Arrays.sort(score);
		int max = score[N-1];
		
		//평균 구하기
		double[] avg = new double[N];
		double sum = 0;
		for(int i = 0; i < N; i++) {
			avg[i] = (score[i]*1.0/max)*100;	//정수값으로 지정된 score배열을 1.0을 곱해줘서 double형으로 변환
			sum += avg[i];
		}
		
		System.out.println(sum/N);
		
	}

}
