/* [종합] 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는, 방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)
 * 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
 * 입력 : 3 7 9	-> 출력 : 63	*/
import java.util.Scanner;

public class C1092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		for(int day = 1; day <= num1*num2*num3; day++) {
			if(day % num1 == 0 && day % num2 == 0 && day % num3 == 0) {
				System.out.println(day);
				break;
			}
		}
		
	}

}
