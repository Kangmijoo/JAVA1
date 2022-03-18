/* [종합] 3 6 9 프로그램. 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데, 3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
 * 입력 : 9	-> 출력 : 1 2 X 4 5 X 7 8 X	*/
import java.util.Scanner;

public class C1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				System.out.print("X ");
			} else {
				System.out.print(i+" ");
			}
		}
		
	}

}
