/* 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성. 첫째 줄에 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
 * 입력 : 734 893	 -> 출력 : 437	/ 입력 : 221 231	-> 출력 : 132	 / 입력 : 839 237	 -> 출력 : 938	*/
import java.util.Scanner;

public class C07_2908 {

	public static int reverseInt(int x) {
		int result = 0;
		
		int a = x % 10;			//일의 자리
		int b = x % 100 / 10;	//십의 자리
		int c = x / 100;		//백의 자리
		result = a*100 + b*10 + c;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int first = reverseInt(A);
		int second = reverseInt(B);
		
		System.out.println(first>second ? first:second);
	}

}
