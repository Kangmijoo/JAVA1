/* 축구경기 타임은 총 90분이고, 성익이는 5분마다 골을 넣을 수 있는 능력을 가지고 있다. 
 * 만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 
 * 현재 경기타임과 우리팀의 득점이 입력으로 주어 질때, 성익이를 투입하면 우리팀의 최종 득점은 몇 점인지 출력하시오.
 * 입력 : 74 2	-> 출력 : 6	*/
import java.util.Scanner;

public class C1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int score = sc.nextInt();
		sc.close();
		
		//90-time-1 : -1하는 이유는 마지막 5분이 딱 90분일 때 점수가 추가 되는 것을 방지
		//총 점수에서 +1을 하는 이유는 투입될 때 점수 추가
		int result = ((90-time-1)/5)+1;
		System.out.println(score+result);
	}

}
