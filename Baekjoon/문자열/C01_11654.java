/* 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오. 
 * 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 입력 : A  -> 출력 : 65	/ 입력 : C  -> 출력 : 67	/ 입력 : 0  -> 출력 : 48	/ 입력 : 9  -> 출력 : 57	
 * ps : 아스키코드 말고 유니코드로 출력하고 싶다면 지금과 반대로 char대신 int로 받아와서 (char)ch 이런 식으로 출력		*/
import java.util.Scanner;

public class C01_11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);	//주어진 글자 하나를 가져옴
		sc.close();
		
		// 아스키 코드로 변환해서 출력 
		System.out.println((int)ch);	
	}

}
