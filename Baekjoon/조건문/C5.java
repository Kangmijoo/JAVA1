/* 입력한 시간보다 45분 빠른 시간 출력(0 ≤ H ≤ 23, 0 ≤ M ≤ 59). 설정한 놓은 알람 시간 H시 M분을 의미한다. 입력 시간은 24시간 표현을 사용한다. 
 * 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
 * 입력 : 10 10	-> 출력 : 9 25 / 입력 : 0 30	-> 출력 : 23 45	*/
import java.util.Scanner;

public class C5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		//결과 값을 분으로 나타냄
		int result = (H*60+M)-45;	
		
		//결과 값을 시와 분으로 나눔
		int hour, min;
		if(H == 0 && M < 45) {	//입력 시간이 0시 ~ 0시 44분
			hour = 23;
			min = 60+result;
		} else {				//나머지
			hour = result/60;
			min = result%60;			
		}
		
		System.out.printf("%d %d", hour, min);
		
	}

}
