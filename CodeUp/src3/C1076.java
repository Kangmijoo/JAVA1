/* [반복실행구조] 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자. 
 * 입력 : f	-> 출력 : a b c d e f		*/
import java.util.Scanner;

public class C1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		char first = 'a';
		
		do {
			System.out.print(first + " ");
			first++;
		} while(first <= ch);
		sc.close();
	}

}
