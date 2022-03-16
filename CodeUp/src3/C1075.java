/* [반복실행구조] 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
 * 입력 : 5	-> 출력 : 4
					3
					2
					1
					0	*/
import java.util.Scanner;

public class C1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = a-1; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
