/* 문자열 S, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성. 첫 번째 문자를 R번 반복, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 됨.
 * 테스트 개수 T(1 ≤ T ≤ 1,000), 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S의 길이는 적어도 1이며, 20글자를 넘지 않음.
 * 입력 : 2 \ 3 ABC \ 5 /HTP	-> 출력 : AAABBBCCC \ /////HHHHHTTTTTPPPPP	*/
import java.util.Scanner;

public class C04_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();	//반복할 횟수
			String S = sc.next();	//반복할 문자열 -> nextline()은 공백까지 출력해서 x
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {	//R만큼 반복해서 출력
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();
		}
		
	}

}
