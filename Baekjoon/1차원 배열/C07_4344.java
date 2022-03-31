/* 첫째 줄에 테스트 케이스의 개수 C가 주어짐. 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, N명의 점수가 주어짐.
 * (0<=점수<=100인 정수) 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
 * 입력 : 5								-> 출력 : 40.000%
		5 50 50 70 80 100						57.143%
		7 100 95 90 80 70 60 50					33.333%
		3 70 90 80								66.667%
		3 70 90 81								55.556%
		9 100 99 98 97 96 95 94 93 91							*/
import java.util.Scanner;

public class C07_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		/* 케이스만큼 입력받음 -> N[i] */
		int[] N = new int[C];
		for(int i = 0; i < C; i++) {
			N[i] = sc.nextInt();
			
			/* 입력받은 명수만큼 점수 입력 받아서-> score[j] 점수 합함 -> total */
			int num = N[i];		//입력 받을 점수 개수
			int[] score = new int[num];		//점수 개수만큼 score배열 만들어 둠
			int total = 0;		//모든 점수 합 넣을 변수
			int j = 0;
			while(j < num) {
				score[j] = sc.nextInt();
				total += score[j];
				j++;
			}
			/* 입력 받은 점수들로 평균 계산 -> avg */
			double avg = total*1.0/num; 
			
			/* 평균을 넘는 사람 -> sum */
			int k = 0;
			int sum = 0;	//평균 넘은 사람 수 추가해줄 변수
			while(k < num) {
				if(score[k]-avg > 0) {
					sum += 1;
				}
				k++;
			}
			/* 평균을 넘는 사람 비율 */
			double result = sum*1.0/N[i]*100;
			
			/* 출력 */
			System.out.printf("%.3f%%\n", result);
		}
		
	}

}
