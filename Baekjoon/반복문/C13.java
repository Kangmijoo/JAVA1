/* [EOF] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (0 < A, B < 10)
 * 입력 : 1 1 \ 2 3 \ 3 4 \ 9 8 \ 5 2	 -> 출력 : 2 \ 5 \ 7 \ 17 \ 7		
 * ps : EOF는 End of File의 약자로, 데이터 소스로부터 더 이상 읽을 수 있는 데이터가 없음을 나타내는 용어		*/
import java.util.Scanner;

public class C13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력된 토큰이 있으면 true를 반환하고, 그렇지 않을 경우 false를 반환
		while(sc.hasNext()) {	
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}

	}

}
