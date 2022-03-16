/* [반복실행구조] 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자. 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다.
 * 입력 : 5	-> 출력 : 5
					4
					3
					2
					1	*/
import java.util.Scanner;

public class C1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = a; i > 0; i--) {
			System.out.println(i);
		}
		
	}

}
