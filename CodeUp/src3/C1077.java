/* [반복실행구조] 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자. 0부터 그 수까지 줄을 바꿔 한 개씩 출력
 * 입력 : 4	-> 출력 : 0
					1
					2
					3
					4	*/
import java.util.Scanner;

public class C1077 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = 0; i <= a; i++) {
			System.out.println(i);
		}
		
	}

}
