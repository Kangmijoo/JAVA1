/* 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
 * 입력 : A	-> 출력 : 65	*/
import java.util.Scanner;

public class C1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int iscii = (int)ch;	//문자를 정수로 캐스팅
		sc.close();
		
		System.out.printf("%d", iscii);

	}

}
