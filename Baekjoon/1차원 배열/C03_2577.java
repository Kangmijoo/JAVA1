/* 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다. 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력
 * 입력 : 150 \ 266 \ 427	 -> 출력 : 3 \ 1 \ 0 \ 2 \ 0 \ 0 \ 0 \ 2 \ 0 \ 0		*/
import java.util.Scanner;

public class C03_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gob = String.valueOf(sc.nextInt()*sc.nextInt()*sc.nextInt());
		sc.close();
		
		/*배열 1~9 모두 0으로 초기화*/
		int[] cal = new int[10];
		for(int i = 0; i < cal.length; i++) {
			cal[i] = 0;
		}
		
		/*계산 결과 한자리씩 가져와서 해당되는 배열 위치에 하나씩 +1*/
		for(int i = 0; i < gob.length(); i++) {
			char x = gob.charAt(i);
			cal[x - '0']++;		//char이니까 int형으로 변환해서 넣어줘야 함
		}
		
		/*출력*/
		for(int i = 0; i <= 9; i++) {
			System.out.println(cal[i]);
		}
		
	}

}
