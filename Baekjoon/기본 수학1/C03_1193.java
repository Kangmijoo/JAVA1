/* 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오. 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 * 입력 : 1	-> 출력 : 1/1	  / 입력 : 2	-> 출력 : 1/2	  / 입력 : 3	-> 출력 : 2/1	  / 입력 : 4	-> 출력 : 3/1		*/
import java.util.Scanner;

public class C03_1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		int a = 1;
		int b = 1;
		
		if(X == 1) {
			System.out.println("1/1");
		} else {
			
		}
	}

}
